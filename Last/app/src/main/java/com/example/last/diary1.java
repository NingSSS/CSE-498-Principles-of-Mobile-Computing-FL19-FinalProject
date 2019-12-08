package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class diary1 extends AppCompatActivity {
    private TextView diary_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary1);
        Intent intent = getIntent();
        final String usenamevalue = intent.getStringExtra("username2");
        final String diary_num = intent.getStringExtra("diary_num");
        String usename = usenamevalue.split(":")[1];
        diary_1 = (TextView) findViewById(R.id.textView14);
        new Connection3(diary1.this,diary_1).execute(diary_num,usename);
    }
}
