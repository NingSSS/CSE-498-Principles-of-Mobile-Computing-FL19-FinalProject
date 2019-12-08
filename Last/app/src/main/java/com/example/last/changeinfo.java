package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class changeinfo extends AppCompatActivity {
    private EditText depressionField,phoneField,othersphoneField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changeinfo);
        Intent intent = getIntent();
        final String usenamevalue = intent.getStringExtra("username2");
        TextView name = (TextView) findViewById(R.id.textView8);
        name.setText(usenamevalue);
        Button button_7 = (Button) findViewById(R.id.button7);
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                depressionField = (EditText) findViewById(R.id.editText6);
                String depression = depressionField.getText().toString();
                phoneField = (EditText)findViewById(R.id.editText7);
                othersphoneField = (EditText)findViewById(R.id.editText8);
                String phone = phoneField.getText().toString();
                String othersphone = othersphoneField.getText().toString();
                System.out.println(usenamevalue.split(":")[1]);
                String name = usenamevalue.split(":")[1];
                new Connection2().execute("configration",name,depression,phone,othersphone);

                Intent i = new Intent(changeinfo.this, login.class);
                startActivity(i);
            }
        });
    }
}
