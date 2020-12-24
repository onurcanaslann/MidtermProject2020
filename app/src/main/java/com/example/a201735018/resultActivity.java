package com.example.a201735018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {
    TextView tv,tv2,tv3;
    Button restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv=(TextView)findViewById(R.id.textView14);
        tv2=(TextView)findViewById(R.id.textView15);
        tv3=(TextView)findViewById(R.id.textView16);
        restartButton=(Button)findViewById(R.id.button8);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct Answers "+questionsActivity.correct+"\n");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answer "+questionsActivity.wrong+"\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score "+questionsActivity.correct+"\n");
        tv.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);

        questionsActivity.correct=0;
        questionsActivity.wrong=0;

        restartButton.setOnClickListener((v) ->{
            Intent inntent = new Intent(getApplicationContext(),QuizActivity.class);
            startActivity(inntent);
        });
    }
}