package com.example.poornima.calculator;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1 ,number2;
    Button add,substract,multiply,divide;
    float rnum;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        add = (Button)findViewById(R.id.add);
        substract = (Button)findViewById(R.id.substract);
        divide = (Button)findViewById(R.id.divide);
        multiply = (Button)findViewById(R.id.multiply);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                rnum = num1 + num2;
                result.setText(String.valueOf(rnum));
            }

        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                rnum = num1 - num2;
                result.setText(String.valueOf(rnum));
            }

        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                rnum = num1 * num2;
                result.setText(String.valueOf(rnum));
            }

        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                rnum = num1 / num2;
                result.setText(String.valueOf(rnum));
            }

        });
    }
}
