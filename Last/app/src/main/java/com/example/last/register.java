package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class register extends AppCompatActivity {
    private EditText usernameField1,passwordField1,confirmpasswordField1;
    private TextView usersname,name,interest,frequency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button button_4 = (Button) findViewById(R.id.button4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usernameField1 = (EditText)findViewById(R.id.editText3);
                passwordField1 = (EditText)findViewById(R.id.editText4);
                confirmpasswordField1 = (EditText)findViewById(R.id.editText5);
                String username = usernameField1.getText().toString();
                String password = passwordField1.getText().toString();
                String confirmpassword = confirmpasswordField1.getText().toString();
                if(confirmpassword.equals(password)){
                    new Connection().execute("register", username,password);
                    Intent i = new Intent(register.this, login.class);
                    startActivity(i);
                }
                else{
                    System.out.println("The confirmed password is wrong");
                }
            }
        });
    }
}
