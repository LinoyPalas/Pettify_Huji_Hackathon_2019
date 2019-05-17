package com.example.hackathon2019;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channel;
import java.util.ArrayList;


public class ResultActivity extends AppCompatActivity {

    public ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    public TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;

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

        String[] imgArray = new String[20];
        String[] descArray = new String[20];
        for (int i = 0; i < 20; i++) {
            imgArray[i] = QuestionActivity.matches.get(i).animal.imageLink;
            descArray[i] = QuestionActivity.matches.get(i).animal.description;
        }

        txt1.setText(descArray[0] + "\n" + QuestionActivity.matches.get(0).animal.phoneNum);
        txt2.setText(descArray[1] + "\n" + QuestionActivity.matches.get(1).animal.phoneNum);
        txt3.setText(descArray[2] + "\n" + QuestionActivity.matches.get(2).animal.phoneNum);
        txt4.setText(descArray[3] + "\n" + QuestionActivity.matches.get(3).animal.phoneNum);
        txt5.setText(descArray[4] + "\n" + QuestionActivity.matches.get(4).animal.phoneNum);
        txt6.setText(descArray[5] + "\n" + QuestionActivity.matches.get(5).animal.phoneNum);
        txt7.setText(descArray[6] + "\n" + QuestionActivity.matches.get(6).animal.phoneNum);
        txt8.setText(descArray[7] + "\n" + QuestionActivity.matches.get(7).animal.phoneNum);

        LoadImageFromWebOperations(imgArray[0], btn1);
        LoadImageFromWebOperations(imgArray[1], btn2);
        LoadImageFromWebOperations(imgArray[2], btn3);
        LoadImageFromWebOperations(imgArray[3], btn4);
        LoadImageFromWebOperations(imgArray[4], btn5);
        LoadImageFromWebOperations(imgArray[5], btn6);
        LoadImageFromWebOperations(imgArray[6], btn7);
        LoadImageFromWebOperations(imgArray[7], btn8);



    }

    public static void LoadImageFromWebOperations(final String url, final ImageButton btn) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStream is = (InputStream) new URL(url).getContent();
                    Drawable d = Drawable.createFromStream(is, "src name");
                    btn.setBackground(d);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
        th.start();
    }


}
