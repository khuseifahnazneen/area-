package com.naaz.assignmnt3;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class rectangle extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle);
        Button calculate,clear;
        EditText width;
        EditText height;
        EditText answer;
        calculate=findViewById(R.id.y);
        clear=findViewById(R.id.clear);
        width=findViewById(R.id.editTextNumber4);
        answer=findViewById(R.id.editTextNumber3);
        height=findViewById(R.id.editTextNumber);

        calculate.setOnClickListener(v -> {
            if((width.getText().toString().isEmpty())||(height.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter some number!");
            }
            else
            {
                double l = Double.parseDouble(width.getText().toString());
                double h = Double.parseDouble(height.getText().toString());
                double ans=l*h;
                answer.setText("Area =  "+ans);
            }

        });
        clear.setOnClickListener(v -> {
            width.setText("");
            height.setText("");
            answer.setText("");
        });
    }
}
