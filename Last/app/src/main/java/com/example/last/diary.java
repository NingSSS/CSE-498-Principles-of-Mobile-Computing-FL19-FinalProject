package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class diary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        Intent intent = getIntent();
        final String usenamevalue = intent.getStringExtra("username2");
        TextView name = (TextView) findViewById(R.id.textView16);
        name.setText(usenamevalue);
        Button button_10 = (Button) findViewById(R.id.button10);
        Button button_11 = (Button) findViewById(R.id.button11);
        Button button_12 = (Button) findViewById(R.id.button12);
        Button button_13 = (Button) findViewById(R.id.button13);
        Button button_14 = (Button) findViewById(R.id.button14);
        Button button_15 = (Button) findViewById(R.id.button15);
        Button button_16 = (Button) findViewById(R.id.button16);
        Button button_17 = (Button) findViewById(R.id.button17);
        Button button_18 = (Button) findViewById(R.id.button18);

        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(diary.this, diary1.class);
                TextView name2 = (TextView) findViewById(R.id.textView16);
                String username2 = name2.getText().toString();
                String diary_num = "get_diary1";
                i.putExtra("username2", username2);
                i.putExtra("diary_num",diary_num);
                startActivity(i);
            }
        });

        button_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(diary.this, diary1.class);
                TextView name2 = (TextView) findViewById(R.id.textView16);
                String username2 = name2.getText().toString();
                String diary_num = "get_diary2";
                i.putExtra("username2", username2);
                i.putExtra("diary_num",diary_num);
                startActivity(i);
            }
        });

        button_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(diary.this, diary1.class);
                TextView name2 = (TextView) findViewById(R.id.textView16);
                String username2 = name2.getText().toString();
                String diary_num = "get_diary3";
                i.putExtra("username2", username2);
                i.putExtra("diary_num",diary_num);
                startActivity(i);
            }
        });

        button_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(diary.this, diary1.class);
                TextView name2 = (TextView) findViewById(R.id.textView16);
                String username2 = name2.getText().toString();
                String diary_num = "get_diary4";
                i.putExtra("username2", username2);
                i.putExtra("diary_num",diary_num);
                startActivity(i);
            }
        });

        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(diary.this, diary2.class);
                TextView name2 = (TextView) findViewById(R.id.textView16);
                String username2 = name2.getText().toString();
                String diary_num = "get_diary1";
                i.putExtra("username2", username2);
                i.putExtra("diary_num",diary_num);
                startActivity(i);
            }
        });

        button_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(diary.this, diary2.class);
                TextView name2 = (TextView) findViewById(R.id.textView16);
                String username2 = name2.getText().toString();
                String diary_num = "get_diary2";
                i.putExtra("username2", username2);
                i.putExtra("diary_num",diary_num);
                startActivity(i);
            }
        });

        button_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(diary.this, diary2.class);
                TextView name2 = (TextView) findViewById(R.id.textView16);
                String username2 = name2.getText().toString();
                String diary_num = "get_diary3";
                i.putExtra("username2", username2);
                i.putExtra("diary_num",diary_num);
                startActivity(i);
            }
        });

        button_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(diary.this, diary2.class);
                TextView name2 = (TextView) findViewById(R.id.textView16);
                String username2 = name2.getText().toString();
                String diary_num = "get_diary4";
                i.putExtra("username2", username2);
                i.putExtra("diary_num",diary_num);
                startActivity(i);
            }
        });

        button_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(diary.this, main.class);
                startActivity(i);
            }
        });
    }
}
