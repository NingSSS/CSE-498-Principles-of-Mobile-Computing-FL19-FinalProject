package com.example.last;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Connection4 extends AsyncTask<String,Void,String> {
    private EditText DiaryField;
    private Context context;

    public Connection4(Context context, EditText Diary_Field){
        this.context = context;
        this.DiaryField = Diary_Field;

    }
    protected void onPreExecute() {
    }

    protected  String doInBackground(String... params){
        try{
            String method = (String)params[0];
            String username = (String)params[1];

            String data= URLEncoder.encode("method","UTF-8")+"="+URLEncoder.encode(method,"UTF-8");
            data+="&"+URLEncoder.encode("username","UTF-8")+"="+URLEncoder.encode(username,"UTF-8");
//            data+="&"+URLEncoder.encode("diary_num","UTF-8")+"="+URLEncoder.encode(diary_num,"UTF-8");
            String link="http://10.0.2.2:8888/demo/index_1.php";
            URL url=new URL(link);
            URLConnection conn=url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr= new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader reader= new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb=new StringBuilder();
            String line=null;
            while ((line=reader.readLine())!=null){
                sb.append(line);
            }
            Log.d("My Result: ", sb.toString());
            return sb.toString();

        }
        catch (Exception e){
            return new String("Exception: " + e.getMessage());
        }
    }

    @Override
    protected void onPostExecute(String result){
        this.DiaryField.setText(result);
    }

}

