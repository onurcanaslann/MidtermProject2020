package com.example.a201735018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class questionsActivity extends AppCompatActivity {
    TextView tv;
    Button submitbutton,quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[]={
            "What level of programming language is assembly?",
            "Assembly languages are often referred to as ‘_________’?",
            "Which of the following is C# not used?",
            "Who is C# developed by?",
            "C is _____ programming language.",
            "Which of the following languages is the base for programming?",
            "Who developed the C language?",
            "Which company not using C++ ?",
            "When was Cobol first developed?",
            "Which is not one of the main areas of software?",
            "Which of the following does not affect software quality?",
            "Who developed the Javascript language?",
            "Javascript is _____ programming language.",
            "What level of programming language is Perl?",
            "Which of the following is open source?",
            "Who developed the Python?",
            "Which one is not one of the main sql queries?",
            "Which of the following is java not used?"


    };

    String answers[] = {"Low-level","Symbolic machine level","Mac os application","Microsoft","Structured","C","Dennis Ritchie","Thy","1959","Machine","Conveniences","Brandan Eich","Client-side scripting","High-level","Php","Guido Rossum","TCS","Ios"};
    String opt[]={
            "High-level","Low-level","Middle-level","Hardware-level",
            "Most difficult","Machine code","Symbolic machine level","High_level",
            "Mobile application","Games","Windows application","Mac os application",
            "Microsoft","Apple","Google","Sun microsystem",
            "Object-oriented","Structured","Mobile","Desktop",
            "Java","Python","C","C++",
            "Dennis Ritchie","Bill Gates","Steve Jobs","Steve Ballmer",
            "Facebook","Amazon","Bloomberg","Thy",
            "1959","1960","1992","1994",
            "System","Application","Development","Machine",
            "Usability","Safety","Conveniences","Performance",
            "Brandan Eich","Bill Gates","Steve Wozniack","Steve Jobs",
            "Object-oriented","Structured","Client-side scripting","Desktop",
            "High-level","Low-level","Middle-level","Hardware-level",
            "C","C++","Php","C#",
            "Guido Rossum","Dennis Ritchie","Steve Wozniak","Steve Jobs",
            "DDL","DML","TCL","TCS",
            "Ios","Android","Big data","Apache"
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);


        final TextView score=(TextView)findViewById(R.id.textView12);
        TextView textView=(TextView)findViewById(R.id.textView6);
        Intent intent = getIntent();
        String name=intent.getStringExtra("myname");

        if(name.trim().equals(""))
            textView.setText("Hello User");
        else
            textView.setText("Hello"+" "+name);

        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.button7);
        tv=(TextView)findViewById(R.id.textView10);

        radio_g=(RadioGroup)findViewById(R.id.radioGroup);
        rb1=(RadioButton)findViewById(R.id.radioButton6);
        rb2=(RadioButton)findViewById(R.id.radioButton7);
        rb3=(RadioButton)findViewById(R.id.radioButton8);
        rb4=(RadioButton)findViewById(R.id.radioButton9);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);

        submitbutton.setOnClickListener((v) ->{
            if(radio_g.getCheckedRadioButtonId()==-1){
                Toast.makeText(getApplicationContext(),"Please select one",Toast.LENGTH_SHORT).show();
                return;
            }
            RadioButton uans=(RadioButton)findViewById(radio_g.getCheckedRadioButtonId());
            String ansText=uans.getText().toString();
            Toast.makeText(getApplicationContext(),ansText,Toast.LENGTH_LONG).show();
            if(ansText.equals(answers[flag])){
                correct++;
                Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
            }
            else{
                wrong++;
                Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_SHORT).show();

            }
            flag++;

            if(score!=null)
                score.setText(""+correct);
            if(flag<questions.length){
                tv.setText(questions[flag]);
                rb1.setText(opt[flag*4]);
                rb2.setText(opt[flag*4+1]);
                rb3.setText(opt[flag*4+2]);
                rb4.setText(opt[flag*4+3]);
            }
            else{
                marks=correct;
                Intent in = new Intent(getApplicationContext(),resultActivity.class);
                startActivity(in);
            }
            radio_g.clearCheck();

        });
        quitbutton.setOnClickListener((v) -> {
            Intent inte = new Intent(getApplicationContext(),resultActivity.class);
            startActivity(inte);

        });

    }
}