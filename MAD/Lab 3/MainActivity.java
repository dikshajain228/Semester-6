package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1,n2,r;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText)findViewById(R.id.n1);
        n2=(EditText)findViewById(R.id.n2);
        r=(EditText)findViewById(R.id.result);

        b1=(Button) findViewById(R.id.plus);
        b1.setOnClickListener(this);
        b2=(Button) findViewById(R.id.minus);
        b2.setOnClickListener(this);
        b3=(Button) findViewById(R.id.mul);
        b3.setOnClickListener(this);
        b4=(Button) findViewById(R.id.div);
        b4.setOnClickListener(this);


    }

    public void onClick(View v){
        int no1,no2;
        no1=Integer.parseInt(n1.getText().toString());
        no2=Integer.parseInt(n2.getText().toString());
        int res=0;

        switch(v.getId()){
            case R.id.plus:
                res=no1+no2;
                break;
            case R.id.minus:
                res=no1-no2;
                break;
            case R.id.mul:
                res=no1*no2;
                break;
            case R.id.div:
                if(no2!=0)
                    res=no1/no2;
                break;
        }
        r.setText(String.valueOf(res));
    }
}
