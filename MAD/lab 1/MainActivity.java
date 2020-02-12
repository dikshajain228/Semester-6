package com.example.pgm1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int font=30;
    int cl=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button color = (Button) findViewById(R.id.color);
        final Button size = (Button) findViewById(R.id.font);


    }

    public void changeFontsize(View v){
        final TextView t = (TextView) findViewById(R.id.textView);
        t.setTextSize(font);
        font=font+5;
        if(font==60)
            font=30;
    }

    public void changeFontColor(View v){
        TextView t = (TextView) findViewById(R.id.textView);

        cl=cl%6;
        switch(cl){
            case 0:
                t.setTextColor(Color.RED);
                break;
            case 1:
                t.setTextColor(Color.YELLOW);
                break;
            case 2:
                t.setTextColor(Color.BLUE);
                break;
            case 3:
                t.setTextColor(Color.GREEN);
                break;
            case 4:
                t.setTextColor(Color.GRAY);
                break;
            case 5:
                t.setTextColor(Color.MAGENTA);
                break;
        }
        cl=cl+1;
    }
}

