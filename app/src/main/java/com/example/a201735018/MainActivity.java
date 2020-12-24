package com.example.a201735018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentutorial_activity();
            }
        });
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openQuizAcvtivity();

            }
        });
    }
    public void opentutorial_activity(){
        Intent intent = new Intent(this,tutorial_activity.class);
        startActivity(intent);
    }
    public void openQuizAcvtivity(){
        Intent intent = new Intent(this,QuizActivity.class);
        startActivity(intent);
    }
}