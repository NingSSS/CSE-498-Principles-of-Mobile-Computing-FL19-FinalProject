package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class diary2 extends AppCompatActivity {
    private EditText diary_edit;
    private TextView diary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary2);
        diary_edit = (EditText) findViewById(R.id.editText9);
        Intent intent = getIntent();
        final String usenamevalue = intent.getStringExtra("username2");
        final String diary_num = intent.getStringExtra("diary_num");
        final String username = usenamevalue.split(":")[1];
        new Connection4(diary2.this,diary_edit).execute(diary_num,username);
        Button button_19 = (Button) findViewById(R.id.button19);
        Button button_21 = (Button) findViewById(R.id.button21);

        button_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String diary_text = diary_edit.getText().toString();
                System.out.println(diary_text);
                String a = "edit_" + diary_num.split("_")[1];
                new Connection5().execute(a,username,diary_text);
            }
        });

        button_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String diary_text = diary_edit.getText().toString();
                System.out.println(diary_text);
                String category = "diary";
                new Connection6().execute("share_diary",category,diary_text);
            }
        });
    }
}
