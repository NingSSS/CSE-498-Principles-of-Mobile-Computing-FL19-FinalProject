package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button_8 = (Button) findViewById(R.id.button8);
        Button button_9 = (Button) findViewById(R.id.button9);
        Button button_20 = (Button) findViewById(R.id.button20);
        Button button_23 = (Button) findViewById(R.id.button23);
        Intent intent = getIntent();
        final String usenamevalue = intent.getStringExtra("username2");
        TextView name = (TextView) findViewById(R.id.textView15);
        name.setText(usenamevalue);

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(main.this, diary.class);
                TextView name2 = (TextView) findViewById(R.id.textView15);
                String username2 = name2.getText().toString();
                i.putExtra("username2", username2);
                startActivity(i);
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(main.this, interface_news.class);
                startActivity(i);
            }
        });

        button_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(main.this, search.class);
                startActivity(i);
            }
        });

        button_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(main.this, test.class);
                TextView name2 = (TextView) findViewById(R.id.textView15);
                String username2 = name2.getText().toString();
                i.putExtra("username2", username2);
                startActivity(i);
            }
        });
    }
}
