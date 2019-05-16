package com.example.hackathon2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class QuestionActivity extends AppCompatActivity {

    public ViewFlipper signupFlipper;
    public TextView title, question;

    public boolean answered = false;

    public ImageButton prevButton, nextButton, northButton, centerButton, southButton;

    public int questionCount = 1;
    public final int[] numberOfQuestions = {3, 3, 2, 3};
    public final String[][] questionTitles = {{"בחר איזור", "סגנון מגורים", "האם יש בע״ח נוסף?"},{}};

    public int currentCategory = 0;  // 0 = first category

    public String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        signupFlipper = findViewById(R.id.signup_flipper);

        prevButton = findViewById(R.id.prevButton);
        nextButton = findViewById(R.id.nextButton);
        northButton = findViewById(R.id.northBtn);
        centerButton = findViewById(R.id.centerBtn);
        southButton = findViewById(R.id.southBtn);
        prevButton.setVisibility(View.GONE);
        nextButton.setVisibility(View.GONE);

        title = findViewById(R.id.titleTextView);
        question = findViewById(R.id.questionTextView);

    }

    public void pickNorth(View v) {
        location = "North";
        northButton.setBackground(getResources().getDrawable(R.drawable.map_01_sel));
        centerButton.setBackground(getResources().getDrawable(R.drawable.map_02));
        southButton.setBackground(getResources().getDrawable(R.drawable.map_03));
        nextButton.setVisibility(View.VISIBLE);
    }

    public void pickCenter(View v) {
        location = "Center";
        northButton.setBackground(getResources().getDrawable(R.drawable.map_01));
        centerButton.setBackground(getResources().getDrawable(R.drawable.map_02_sel));
        southButton.setBackground(getResources().getDrawable(R.drawable.map_03));
        nextButton.setVisibility(View.VISIBLE);
    }

    public void pickSouth(View v) {
        location = "South";
        northButton.setBackground(getResources().getDrawable(R.drawable.map_01));
        centerButton.setBackground(getResources().getDrawable(R.drawable.map_02));
        southButton.setBackground(getResources().getDrawable(R.drawable.map_03_sel));
        nextButton.setVisibility(View.VISIBLE);
    }

    public void previousView(View v) {
        signupFlipper.setInAnimation(this, R.anim.slide_in_right);
        signupFlipper.setOutAnimation(this, R.anim.slide_out_left);
        signupFlipper.showPrevious();

        questionCount--;
        if (questionCount <= 1) {
            prevButton.setVisibility(View.GONE);
        }
        boolean flag;
        switch (currentCategory) {
            case 0:
                flag = (questionCount < numberOfQuestions[0]);
                nextButton.setClickable(flag);
                break;
            case 1:
                flag = (questionCount < numberOfQuestions[1]);
                nextButton.setClickable(flag);
                break;
            case 2:
                flag = (questionCount < numberOfQuestions[2]);
                nextButton.setClickable(flag);
                break;
            case 3:
                flag = (questionCount < numberOfQuestions[3]);
                nextButton.setClickable(flag);
                break;
            default:
                break;
        }
    }

    public void nextView(View v) {
        signupFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        signupFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
        signupFlipper.showNext();

        questionCount++;
        if (questionCount > 1) {
            prevButton.setVisibility(View.VISIBLE);
        }
        boolean flag;
        switch (currentCategory) {
            case 0:
                flag = (questionCount < numberOfQuestions[0]);
                nextButton.setClickable(flag);
                break;
            case 1:
                flag = (questionCount < numberOfQuestions[1]);
                nextButton.setClickable(flag);
                break;
            case 2:
                flag = (questionCount < numberOfQuestions[2]);
                nextButton.setClickable(flag);
                break;
            case 3:
                flag = (questionCount < numberOfQuestions[3]);
                nextButton.setClickable(flag);
                break;
            default:
                break;
        }

        nextButton.setVisibility(View.GONE);
    }
}
