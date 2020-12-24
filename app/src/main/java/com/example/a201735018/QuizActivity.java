package com.example.a201735018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuizActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button startbutton = (Button) findViewById(R.id.button5);
        Button aboutbutton = (Button) findViewById(R.id.button6);
        final EditText nametext = (EditText) findViewById(R.id.editTextTextPersonName);

        startbutton.setOnClickListener((v) -> {
            String name=nametext.getText().toString();
            Intent intentt=new Intent(getApplicationContext(),questionsActivity.class);
            intentt.putExtra("myname",name);
            startActivity(intentt);

        });
        aboutbutton.setOnClickListener((v) -> {
            Intent intentt=new Intent(getApplicationContext(),developerActivity.class);
            startActivity(intentt);


        });


    }
}