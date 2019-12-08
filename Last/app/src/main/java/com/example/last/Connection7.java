package com.example.last;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Connection7 extends AsyncTask<String,Void,String> {
    private TextView diary_text;
    private Context context;

    public Connection7(Context context, TextView diary_text){
        this.context = context;
        this.diary_text = diary_text;

    }
    protected void onPreExecute() {
    }

    protected  String doInBackground(String... params){
        try{
            String method = (String)params[0];
            String search_text = (String)params[1];

            String data= URLEncoder.encode("method","UTF-8")+"="+URLEncoder.encode(method,"UTF-8");
            data+="&"+URLEncoder.encode("search_text","UTF-8")+"="+URLEncoder.encode(search_text,"UTF-8");
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
        result = result.replace("/n","\n");
        System.out.println(result);
        this.diary_text.setText(result);
    }

}

