package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1 ,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String name,usn,email;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=(TextView)findViewById(R.id.t2);
        t2=(TextView)findViewById(R.id.t3);
        t3=(TextView)findViewById(R.id.t4);

        Intent i=getIntent();
        name=i.getStringExtra("name_key");
        email=i.getStringExtra("email_key");
        usn=i.getStringExtra("usn_key");

        t1.setText(name);
        t2.setText(email);
        t3.setText(usn);
    }
}
