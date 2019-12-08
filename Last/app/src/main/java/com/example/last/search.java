package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class search extends AppCompatActivity {
    private EditText search_text1;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button button_22 = (Button) findViewById(R.id.button22);
        button_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                search_text1 = (EditText)findViewById(R.id.editText10);
                result = (TextView)findViewById(R.id.textView18);

                String search_text = search_text1.getText().toString();
                if (search_text.equals("diary")){
                    System.out.println(search_text);
                    new Connection7(search.this,result).execute("search_diary",search_text);
                }
                if (search_text.equals("story")){
                    System.out.println(search_text);
                    new Connection8(search.this,result).execute("search_story",search_text);
                    result.setAutoLinkMask(Linkify.ALL);
                    result.setMovementMethod(LinkMovementMethod.getInstance());
                }
                if (search_text.equals("question")){
                    System.out.println(search_text);
                    new Connection9(search.this,result).execute("search_question",search_text);
                    result.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v)
                        {
                            Uri uri = Uri.parse("https://www.everydayhealth.com/depression/10-key-questions-about-depression/what-is-depression.aspx");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                }
                if (!search_text.equals("diary") && !search_text.equals("story") && !search_text.equals("question")) {
                    System.out.println(search_text);
                    new Connection11(search.this,result).execute("search_key",search_text);
                }

//                new Connection1(login.this,name,depression,phone,others_phone).execute("login",username,password);
            }
        });

    }
}
