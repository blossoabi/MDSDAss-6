package com.example.android.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    EditText editText;
    TextView textView;
    String converted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        textView=findViewById(R.id.text);
        editText=findViewById(R.id.editText);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!(editText.getText().toString().isEmpty()) ){
                    float n =Float.parseFloat(editText.getText().toString());
                    converted =  Float.toString((n*9/5)+32);
                    textView.setText(converted);
                    textView.setVisibility(TextView.VISIBLE);
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(editText.getText().toString().isEmpty())){
                    float n =Float.parseFloat(editText.getText().toString());
                    converted =  Float.toString((n-32)*5/9);
                    textView.setText(converted);
                    textView.setVisibility(TextView.VISIBLE);
                }

            }
        });
    }
}
