package com.naaz.assignmnt3;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class circle extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);
        Button calculate,clear;

        EditText radius;
        EditText answer;
        calculate=findViewById(R.id.y);
        clear=findViewById(R.id.clear);

        answer=findViewById(R.id.editTextNumber2);
        radius=findViewById(R.id.editTextNumber);

        calculate.setOnClickListener(v -> {
            if(((radius.getText().toString().isEmpty())))
            {
                answer.setText("Please Enter some number!");
            }
            else
            {
                double r = Double.parseDouble(radius.getText().toString());
                double ans=(22.0/7.0)*(r*r);
                answer.setText("Area  =  "+ans);
            }

        });
        clear.setOnClickListener(v -> {
            radius.setText("");
            answer.setText("");
        });
    }
}
