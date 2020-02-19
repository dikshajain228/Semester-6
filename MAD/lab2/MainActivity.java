package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText name, email, usn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        submit = (Button)findViewById(R.id.submit);
//        submit.setOnClickListener(this);

    }


    public void onClic(View v) {

        String n, e, u;

//        submit=(Button)findViewById(R.id.submit);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        usn = (EditText) findViewById(R.id.usn);

        n = name.getText().toString();
        e = email.getText().toString();
        u = usn.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("name_key", n);
        intent.putExtra("email_key", e);
        intent.putExtra("usn_key", u);
        startActivity(intent);


    }
}