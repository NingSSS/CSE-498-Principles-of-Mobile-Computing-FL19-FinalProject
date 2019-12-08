package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class login extends AppCompatActivity {
    private  EditText usernameField,passwordField;
    private TextView name,depression,phone,others_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button_2 = (Button) findViewById(R.id.button2);
        Button button_3 = (Button) findViewById(R.id.button3);
        Button button_5 = (Button) findViewById(R.id.button5);
        Button button_6 = (Button) findViewById(R.id.button6);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usernameField = (EditText)findViewById(R.id.editText);
                passwordField = (EditText)findViewById(R.id.editText2);
                name = (TextView)findViewById(R.id.textView4);
                depression = (TextView)findViewById(R.id.textView5);
                phone = (TextView)findViewById(R.id.textView6);
                others_phone = (TextView) findViewById(R.id.textView7);

                String username = usernameField.getText().toString();
                String password = passwordField.getText().toString();
                new Connection1(login.this,name,depression,phone,others_phone).execute("login",username,password);
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this, changeinfo.class);
                TextView name2 = (TextView) findViewById(R.id.textView4);
                String username2 = name2.getText().toString();
                i.putExtra("username2", username2);
                startActivity(i);
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this, main.class);
                TextView name2 = (TextView) findViewById(R.id.textView4);
                String username2 = name2.getText().toString();
                i.putExtra("username2", username2);
                startActivity(i);
            }
        });


        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(login.this, register.class);
                startActivity(i);
            }
        });
    }
}
