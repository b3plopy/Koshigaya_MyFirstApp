package com.example.koshigaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name;
    TextView myName;
    TextView myDisplay;
    TextView myHello;
    Button myButton;
    Button myClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.textView);
        myName = (TextView) findViewById(R.id.textView2);
        myDisplay = (TextView) findViewById(R.id.textView3);
        myHello = (TextView) findViewById(R.id.textView4);
        myButton = (Button) findViewById(R.id.button);
        myClear = (Button) findViewById(R.id.button2);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            myHello.setText("Hello Yukio!");
            }
        });

        myClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            myHello.setText("Hello!");
            }
        });










    }
}