package com.example.a201735018;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class tutorial_activity2 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_activity2);

        pdfView=findViewById(R.id.pdfView);

        int language_position=getIntent().getIntExtra("key_position",0);
        if(language_position==0){
            pdfView.fromAsset("assembly.pdf").load();
        }
        else if(language_position==1){
            pdfView.fromAsset("c#.pdf").load();
        }
        else if(language_position==2){
            pdfView.fromAsset("c++.pdf").load();
        }
        else if(language_position==3){
            pdfView.fromAsset("c.pdf").load();
        }
        else if(language_position==4){
            pdfView.fromAsset("cobol.pdf").load();
        }
        else if(language_position==5){
            pdfView.fromAsset("go.pdf").load();
        }
        else if(language_position==6){
            pdfView.fromAsset("information.pdf").load();
        }
        else if(language_position==7){
            pdfView.fromAsset("java.pdf").load();
        }
        else if(language_position==8){
            pdfView.fromAsset("javascript.pdf").load();
        }
        else if(language_position==9){
            pdfView.fromAsset("perl.pdf").load();
        }
        else if(language_position==10){
            pdfView.fromAsset("php.pdf").load();
        }
        else if(language_position==11){
            pdfView.fromAsset("python.pdf").load();
        }
        else if(language_position==12){
            pdfView.fromAsset("r.pdf").load();
        }
        else if(language_position==13){
            pdfView.fromAsset("sql.pdf").load();
        }
        else if(language_position==14){
            pdfView.fromAsset("vb.net.pdf").load();
        }

    }
}