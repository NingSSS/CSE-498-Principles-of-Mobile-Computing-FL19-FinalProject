package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class test1 extends AppCompatActivity {
    private EditText test_score1;
    private TextView usernameField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        Intent intent = getIntent();
        final String usenamevalue = intent.getStringExtra("username2");
        TextView name = (TextView) findViewById(R.id.textView25);
        name.setText(usenamevalue);
        Button button_24 = (Button) findViewById(R.id.button24);
        button_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test_score1 = (EditText) findViewById(R.id.editText11);
                String test_score = test_score1.getText().toString();
                usernameField = (TextView) findViewById(R.id.textView25);
                String username = usernameField.getText().toString().split(":")[1];
                System.out.println(username);
                System.out.println(test_score);
                new  Connection10().execute("test",username,test_score);
            }
        });

    }
}
