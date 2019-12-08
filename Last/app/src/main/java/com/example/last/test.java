package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button button_25 = (Button) findViewById(R.id.button25);
        Intent intent = getIntent();
        final String usenamevalue = intent.getStringExtra("username2");
        TextView name = (TextView) findViewById(R.id.textView23);
        name.setText(usenamevalue);
        button_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(test.this, test1.class);
                TextView name2 = (TextView) findViewById(R.id.textView23);
                String username2 = name2.getText().toString();
                i.putExtra("username2", username2);
                startActivity(i);
            }
        });

    }
}
