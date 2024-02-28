package com.example.sorokinv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView number, number2, result;
    CharSequence i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (TextView) findViewById(R.id.text6);
        number2 = (TextView) findViewById(R.id.text1);
        result = (TextView) findViewById(R.id.text5);
    }

    public void plusplus(View view) {
        i =  result.getText();
        if(i == null) { i= "NUM 1 no value! Err"; result.setText(i); return;}
        float d = Float.parseFloat(String.valueOf(i));

        d++;

        i = Float.toString(d);

        result.setText(i);
    }

    public void add(View view) {
        i =  number.getText();
        if(i == null) { i= "NUM 1 no value! Err"; result.setText(i); return;}
        float d = Float.parseFloat(String.valueOf(i));
        i =  number2.getText();
        if(i == null) { i= "NUM 2 no value! Err"; result.setText(i); return;}
        float dd = Float.parseFloat(String.valueOf(i));

        d = d + dd;

        i = Float.toString(d);
        result.setText(i);
    }

    public void sub(View view) {
        i =  number.getText();
        if(i == null) { i= "NUM 1 no value! Err"; result.setText(i); return;}
        float d = Float.parseFloat(String.valueOf(i));
        i =  number2.getText();
        if(i == null) { i= "NUM 2 no value! Err"; result.setText(i); return;}
        float dd = Float.parseFloat(String.valueOf(i));

        d = d - dd;

        i = Float.toString(d);
        result.setText(i);
    }

    public void div(View view) {
        i =  number.getText();
        if(i == null) { i= "NUM 1 no value! Err"; result.setText(i); return;}
        float d = Float.parseFloat(String.valueOf(i));
        i =  number2.getText();
        if(i == null) { i= "NUM 2 no value! Err"; result.setText(i); return;}
        float dd = Float.parseFloat(String.valueOf(i));
        if(!(dd == 0 || d == 0)) {
        d = d / dd;

            i = Float.toString(d);}
        else{
            i = "value = 0! Err";
        }
        result.setText(i);
    }

    public void mul(View view) {
        i =  number.getText();
        if(i == null) { i= "NUM 1 no value! Err"; result.setText(i); return;}
        float d = Float.parseFloat(String.valueOf(i));
        i =  number2.getText();
        if(i == null) { i= "NUM 2 no value! Err"; result.setText(i); return;}
        float dd = Float.parseFloat(String.valueOf(i));

        d = d * dd;

        i = Float.toString(d);
        result.setText(i);
    }

    public void pow(View view) {
        i =  number.getText();
        if(i == null) { i= "NUM 1 no value! Err"; result.setText(i); return;}
        float d = Float.parseFloat(String.valueOf(i));
        i =  number2.getText();
        if(i == null) { i= "NUM 2 no value! Err"; result.setText(i); return;}
        float dd = Float.parseFloat(String.valueOf(i));

        d = d%dd;

        i = Float.toString(d);
        result.setText(i);
    }

}