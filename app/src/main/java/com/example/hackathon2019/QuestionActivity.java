package com.example.hackathon2019;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
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
    public ImageButton privateHome,apartment, ground, groundWithGarden, aboveGround;

    public int questionCount = 0;
    public final int[] numberOfQuestions = {3, 2, 3, 2};
    public final String[] categoryTitles = {"מגורים", "אישי", "עבודה", "בריאותי"};
    public final String[][] questionTitles = {{"בחר איזור", "סגנון מגורים", "האם יש בע״ח נוסף?"},{"מצב משפחתי", "מספר נפשות בבית"}};

    public int currentCategory = 0;  // 0 = first category

    public String location;
    public String[] livingArrangement = new String[2];
    public String extraAnimals = "";

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

        ground = findViewById(R.id.ground);
        groundWithGarden = findViewById(R.id.groundWithGarden);
        aboveGround = findViewById(R.id.aboveGround);
        ground.setVisibility(View.GONE);
        groundWithGarden.setVisibility(View.GONE);
        aboveGround.setVisibility(View.GONE);

        title = findViewById(R.id.titleTextView);
        question = findViewById(R.id.questionTextView);

        setTitles();

    }

    public void dog(View v) {
        extraAnimals += "dog, ";
    }

    public void cat(View v) {
        extraAnimals += "cat, ";
    }

    public void fish(View v) {
        extraAnimals += "fish, ";
    }

    public void lizard(View v) {
        extraAnimals += "lizard, ";
    }

    public void bird(View v) {
        extraAnimals += "bird, ";
    }

    public void rabbit(View v) {
        extraAnimals += "rabbit, ";
    }

    public void setTitles() {
        title.setText(categoryTitles[currentCategory]);
        question.setText(questionTitles[currentCategory][questionCount]);
    }

    public void privateHome(View v) {
        livingArrangement[0] = "Home";
        livingArrangement[1] = null;
        nextButton.setVisibility(View.VISIBLE);
        ground.setVisibility(View.GONE);
        groundWithGarden.setVisibility(View.GONE);
        aboveGround.setVisibility(View.GONE);
//        buttonEffect(v);
    }

    public void apartment(View v) {
        livingArrangement[0] = "Apartment";
        ground.setVisibility(View.VISIBLE);
        groundWithGarden.setVisibility(View.VISIBLE);
        aboveGround.setVisibility(View.VISIBLE);
        nextButton.setVisibility(View.GONE);
    }

    public void groundWithGarden(View v) {
        livingArrangement[1] = "withGarden";
        nextButton.setVisibility(View.VISIBLE);
    }

    public void ground(View v) {
        livingArrangement[1] = "ground";
        nextButton.setVisibility(View.VISIBLE);
    }

    public void aboveGround(View v) {
        livingArrangement[1] = "aboveGround";
        nextButton.setVisibility(View.VISIBLE);
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
        if (questionCount == 0 && currentCategory == 0) {
            prevButton.setVisibility(View.GONE);
        }

        nextButton.setVisibility(View.VISIBLE);
        if (questionCount < 0) {
            currentCategory--;
            questionCount = numberOfQuestions[currentCategory]-1;
        }

        setTitles();
    }

    public void nextView(View v) {
        signupFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        signupFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
        signupFlipper.showNext();

        questionCount++;
        if (questionCount > 0 || currentCategory > 0) {
            prevButton.setVisibility(View.VISIBLE);
        }

        nextButton.setVisibility(View.GONE);
        if (questionCount == 2 && currentCategory == 0) {
            nextButton.setVisibility(View.VISIBLE);
        }
        if (questionCount == numberOfQuestions[currentCategory]) {
            questionCount = 0;
            currentCategory++;
        }

        setTitles();
    }

//    public static void buttonEffect(View button){
//        button.setOnTouchListener(new View.OnTouchListener() {
//
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN: { // TODO: change color
//                        v.getBackground().setColorFilter(0xe0f47521, PorterDuff.Mode.SRC_ATOP);
//                        v.invalidate();
//                        break;
//                    }
////                    case MotionEvent.ACTION_UP: {
////                        v.getBackground().clearColorFilter();
////                        v.invalidate();
////                        break;
////                    }
//                }
//                return false;
//            }
//        });
//    }
}