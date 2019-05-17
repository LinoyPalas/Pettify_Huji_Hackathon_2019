package com.example.hackathon2019;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.nio.channels.Channel;
import java.util.ArrayList;


public class ResultActivity extends AppCompatActivity {

    public ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    public TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
    static ArrayList<UniquePair> data = QuestionActivity.runSearch.bestMatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txt7 = findViewById(R.id.txt7);
        txt8 = findViewById(R.id.txt8);

        String[] imgArray = new String[8];
        String[] descArray = new String[8];
        for (int i = 0; i < 8; i++) {
            imgArray[i] = data.get(i).animal.imageLink;
            descArray[i] = data.get(i).animal.description;
        }

//        txt1.setText(descArray[0]);
//        txt2.setText(descArray[1]);
//        txt3.setText(descArray[2]);
//        txt4.setText(descArray[3]);
//        txt5.setText(descArray[4]);
//        txt6.setText(descArray[5]);
//        txt7.setText(descArray[6]);
//        txt8.setText(descArray[7]);



    }


}
