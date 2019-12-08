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

public class Connection1 extends AsyncTask<String,Void,String> {
    private TextView nameField,depressionField,phoneField,othersphoneField;
    private Context context;

    public Connection1(Context context,TextView usersnameField,TextView nameField,TextView interestField,TextView freField){
        this.context = context;
        this.nameField = usersnameField;
        this.depressionField = nameField;
        this.phoneField = interestField;
        this.othersphoneField = freField;
    }
    protected void onPreExecute() {
    }

    @Override
    protected  String doInBackground(String... params){
        try{
            String method = (String)params[0];
            String username = (String)params[1];
            String password = (String)params[2];

            String data= URLEncoder.encode("method","UTF-8")+"="+URLEncoder.encode(method,"UTF-8");
            data+="&"+URLEncoder.encode("username","UTF-8")+"="+URLEncoder.encode(username,"UTF-8");
            data+="&"+URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
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
        System.out.println(result);
        String a = "Failed";
        if (!result.equals(a)){
            this.nameField.setText(result.split(";")[0]);
            this.depressionField.setText(result.split(";")[1]);
            this.phoneField.setText(result.split(";")[2]);
            this.othersphoneField.setText(result.split(";")[3]);
        }
        else{
            this.nameField.setText("Login Failed: wrong account or password");
        }
    }
}
