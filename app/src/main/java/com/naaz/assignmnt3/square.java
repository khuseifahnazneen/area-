package com.naaz.assignmnt3;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class square extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square);
        Button calculate,clear;

        EditText length;
        EditText answer;
        calculate=findViewById(R.id.y);
        clear=findViewById(R.id.clear);

        answer=findViewById(R.id.editTextNumber2);
        length=findViewById(R.id.editTextNumber);

        calculate.setOnClickListener(v -> {
            if(((length.getText().toString().isEmpty())))
            {
                answer.setText("Please Enter some number!");
            }
            else
            {
                double r = Double.parseDouble(length.getText().toString());
                double ans=(r*r);
                answer.setText("Area  =  "+ans);
            }

        });
        clear.setOnClickListener(v -> {
            length.setText("");
            answer.setText("");
        });
    }
}
