package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ResourceCursorAdapter;
import android.widget.Toast;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText input = (EditText) findViewById(R.id.input);
        EditText output = (EditText) findViewById(R.id.output);

        int  a = Integer.parseInt(input.getText().toString());

        int b = 75*a;
        String c = Integer.toString(b);
        output.setText(c+" INR");


        //Toast.makeText(this, "INR is"+b, Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
