package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etemperature;
    private TextView resultid;
    private Button btnid1,btnid2;
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnid1 = (Button) findViewById(R.id.btnid1);
        btnid2 = (Button) findViewById(R.id.btnid2);
        resultid = (TextView) findViewById(R.id.resultid);
        etemperature = (EditText) findViewById(R.id.etemperature);

        btnid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double t = Double.parseDouble(etemperature.getText().toString());
                result0 = (t * 1.8) +32;
                resultid.setText(String.valueOf(result0));
            }
        });

        btnid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double t = Double.parseDouble(etemperature.getText().toString());
                result0 = (t - 32) /1.8;
                resultid.setText(String.valueOf(result0));
            }
        });
    }
}