package com.example.hackathon2019;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
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

    public boolean fullOrPart;

    public ImageButton prevButton, nextButton, northButton, centerButton, southButton;
    public ImageButton privateHome,apartment, ground, groundWithGarden, aboveGround;
    public ImageButton friendly, unfriendly;
    public ImageButton dog, cat, fish, lizard, rabbit, bird;
    public ImageButton single, roommates, married, marriedPlus;
    public ImageButton fullTimeJob, partTimeJob, unemployed;
    public ImageButton isAllergic, notAllergic;

    public int questionCount = 0;
    public final int[] numberOfQuestions = {3, 1, 1, 1};
    public final String[] categoryTitles = {"מגורים", "אישי", "עבודה", "בריאותי"};
    public final String[][] questionTitles = {{"בחר איזור", "סגנון מגורים", "האם יש בע״ח נוסף?"},{"מצב משפחתי"}, {"מקום עבודה"}, {"אלרגיות?", "נכות?"}};

    public int currentCategory = 0;  // 0 = first category

    public String location;
    public int livingArrangement;
    public boolean extraAnimals = false;
    public int personalStatus;

    public String job;

    public boolean allergic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        title = findViewById(R.id.titleTextView);
        question = findViewById(R.id.questionTextView);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/OS Aran_W_500FFC.ttf");
        title.setTypeface(custom_font);
        question.setTypeface(custom_font);

        signupFlipper = findViewById(R.id.signup_flipper);

        isAllergic = findViewById(R.id.allergic);
        notAllergic = findViewById(R.id.unallergic);

        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        fish = findViewById(R.id.fish);
        bird = findViewById(R.id.bird);
        lizard = findViewById(R.id.lizard);
        rabbit = findViewById(R.id.rabbit);

        single = findViewById(R.id.single);
        roommates = findViewById(R.id.roommates);
        married = findViewById(R.id.married);
        marriedPlus = findViewById(R.id.marriedPlus);

        fullTimeJob = findViewById(R.id.full_time_job);
        partTimeJob = findViewById(R.id.part_time_job);
        unemployed = findViewById(R.id.unemployed);

        prevButton = findViewById(R.id.prevButton);
        nextButton = findViewById(R.id.nextButton);
        northButton = findViewById(R.id.northBtn);
        centerButton = findViewById(R.id.centerBtn);
        southButton = findViewById(R.id.southBtn);
        prevButton.setVisibility(View.GONE);
        nextButton.setVisibility(View.GONE);

        privateHome = findViewById(R.id.privateHome);
        apartment = findViewById(R.id.apartment);
        ground = findViewById(R.id.ground);
        groundWithGarden = findViewById(R.id.groundWithGarden);
        aboveGround = findViewById(R.id.aboveGround);
        ground.setVisibility(View.GONE);
        groundWithGarden.setVisibility(View.GONE);
        aboveGround.setVisibility(View.GONE);

        friendly = findViewById(R.id.animal_friendly);
        unfriendly = findViewById(R.id.unfriendly);
        friendly.setVisibility(View.GONE);
        unfriendly.setVisibility(View.GONE);

        setTitles();

    }

    public void single(View v) {
        personalStatus = 0;
        nextButton.setVisibility(View.VISIBLE);
        single.setBackground(getResources().getDrawable(R.drawable.single_sel));
        roommates.setBackground(getResources().getDrawable(R.drawable.roommates));
        married.setBackground(getResources().getDrawable(R.drawable.married));
        marriedPlus.setBackground(getResources().getDrawable(R.drawable.married_plus));
    }

    public void roommates(View v) {
        personalStatus = 1;
        nextButton.setVisibility(View.VISIBLE);
        single.setBackground(getResources().getDrawable(R.drawable.single));
        roommates.setBackground(getResources().getDrawable(R.drawable.roommates_sel));
        married.setBackground(getResources().getDrawable(R.drawable.married));
        marriedPlus.setBackground(getResources().getDrawable(R.drawable.married_plus));
    }

    public void married(View v) {
        personalStatus = 2;
        nextButton.setVisibility(View.VISIBLE);
        single.setBackground(getResources().getDrawable(R.drawable.single));
        roommates.setBackground(getResources().getDrawable(R.drawable.roommates));
        married.setBackground(getResources().getDrawable(R.drawable.married_sel));
        marriedPlus.setBackground(getResources().getDrawable(R.drawable.married_plus));
    }

    public void marriedPlus(View v) {
        personalStatus = 3;
        nextButton.setVisibility(View.VISIBLE);
        single.setBackground(getResources().getDrawable(R.drawable.single));
        roommates.setBackground(getResources().getDrawable(R.drawable.roommates));
        married.setBackground(getResources().getDrawable(R.drawable.married));
        marriedPlus.setBackground(getResources().getDrawable(R.drawable.married_plus_sel));
    }

    public void dog(View v) {
        extraAnimals = true;
        dog.setBackground(getResources().getDrawable(R.drawable.dog_sel));
    }

    public void cat(View v) {
        extraAnimals = true;
        cat.setBackground(getResources().getDrawable(R.drawable.cat_sel));
    }

    public void fish(View v) {
        extraAnimals = true;
        fish.setBackground(getResources().getDrawable(R.drawable.fish_sel));
    }

    public void lizard(View v) {
        extraAnimals = true;
        lizard.setBackground(getResources().getDrawable(R.drawable.lizard_sel));
    }

    public void bird(View v) {
        extraAnimals = true;
        bird.setBackground(getResources().getDrawable(R.drawable.bird_sel));
    }

    public void rabbit(View v) {
        extraAnimals = true;
        rabbit.setBackground(getResources().getDrawable(R.drawable.rabbit_sel));
    }

    public void setTitles() {
        title.setText(categoryTitles[currentCategory]);
        question.setText(questionTitles[currentCategory][questionCount]);
    }

    public void privateHome(View v) {
        livingArrangement = 0;
        nextButton.setVisibility(View.VISIBLE);
        ground.setVisibility(View.GONE);
        groundWithGarden.setVisibility(View.GONE);
        aboveGround.setVisibility(View.GONE);
        privateHome.setBackground(getResources().getDrawable(R.drawable.private_home_sel));
        apartment.setBackground(getResources().getDrawable(R.drawable.apartment));
        ground.setBackground(getResources().getDrawable(R.drawable.ground));
        aboveGround.setBackground(getResources().getDrawable(R.drawable.above_ground));
        groundWithGarden.setBackground(getResources().getDrawable(R.drawable.ground_with_garden));
    }

    public void apartment(View v) {
        ground.setVisibility(View.VISIBLE);
        groundWithGarden.setVisibility(View.VISIBLE);
        aboveGround.setVisibility(View.VISIBLE);
        nextButton.setVisibility(View.GONE);
        privateHome.setBackground(getResources().getDrawable(R.drawable.private_home));
        apartment.setBackground(getResources().getDrawable(R.drawable.apartment_sel));
        ground.setBackground(getResources().getDrawable(R.drawable.ground));
        aboveGround.setBackground(getResources().getDrawable(R.drawable.above_ground));
        groundWithGarden.setBackground(getResources().getDrawable(R.drawable.ground_with_garden));
    }

    public void groundWithGarden(View v) {
        livingArrangement = 0;
        nextButton.setVisibility(View.VISIBLE);
        privateHome.setBackground(getResources().getDrawable(R.drawable.private_home));
        apartment.setBackground(getResources().getDrawable(R.drawable.apartment_sel));
        ground.setBackground(getResources().getDrawable(R.drawable.ground));
        aboveGround.setBackground(getResources().getDrawable(R.drawable.above_ground));
        groundWithGarden.setBackground(getResources().getDrawable(R.drawable.ground_with_garden_sel));
    }

    public void ground(View v) {
        livingArrangement = 1;
        nextButton.setVisibility(View.VISIBLE);
        privateHome.setBackground(getResources().getDrawable(R.drawable.private_home));
        apartment.setBackground(getResources().getDrawable(R.drawable.apartment_sel));
        ground.setBackground(getResources().getDrawable(R.drawable.ground_sel));
        aboveGround.setBackground(getResources().getDrawable(R.drawable.above_ground));
        groundWithGarden.setBackground(getResources().getDrawable(R.drawable.ground_with_garden));
    }

    public void aboveGround(View v) {
        livingArrangement = 2;
        nextButton.setVisibility(View.VISIBLE);
        privateHome.setBackground(getResources().getDrawable(R.drawable.private_home));
        apartment.setBackground(getResources().getDrawable(R.drawable.apartment_sel));
        ground.setBackground(getResources().getDrawable(R.drawable.ground));
        aboveGround.setBackground(getResources().getDrawable(R.drawable.above_ground_sel));
        groundWithGarden.setBackground(getResources().getDrawable(R.drawable.ground_with_garden));
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


    public void pickFullTimeJob(View v){
        job = "full time";
        fullOrPart = true;
        nextButton.setVisibility(View.GONE);
        friendly.setVisibility(View.VISIBLE);
        unfriendly.setVisibility(View.VISIBLE);
        fullTimeJob.setBackground(getResources().getDrawable(R.drawable.full_time_job_sel));
        partTimeJob.setBackground(getResources().getDrawable(R.drawable.part_time_job));
        unemployed.setBackground(getResources().getDrawable(R.drawable.unemployed));
        friendly.setBackground(getResources().getDrawable(R.drawable.friendly));
        unfriendly.setBackground(getResources().getDrawable(R.drawable.unfriendly));
    }

    public void pickHalfTimeJob(View v){
        job = "half time";
        fullOrPart = false;
        nextButton.setVisibility(View.GONE);
        friendly.setVisibility(View.VISIBLE);
        unfriendly.setVisibility(View.VISIBLE);
        fullTimeJob.setBackground(getResources().getDrawable(R.drawable.full_time_job));
        partTimeJob.setBackground(getResources().getDrawable(R.drawable.part_time_job_sel));
        unemployed.setBackground(getResources().getDrawable(R.drawable.unemployed));
        friendly.setBackground(getResources().getDrawable(R.drawable.friendly));
        unfriendly.setBackground(getResources().getDrawable(R.drawable.unfriendly));
    }

    public void pickunemployed(View v){
        job = "unemployed";
        nextButton.setVisibility(View.VISIBLE);
        friendly.setVisibility(View.GONE);
        unfriendly.setVisibility(View.GONE);
        fullTimeJob.setBackground(getResources().getDrawable(R.drawable.full_time_job));
        partTimeJob.setBackground(getResources().getDrawable(R.drawable.part_time_job));
        unemployed.setBackground(getResources().getDrawable(R.drawable.unemployed_sel));
        friendly.setBackground(getResources().getDrawable(R.drawable.friendly));
        unfriendly.setBackground(getResources().getDrawable(R.drawable.unfriendly));
    }

    public void pickAnimalFriendly(View v){
        job = "unemployed";
        nextButton.setVisibility(View.VISIBLE);
        if (fullOrPart) {
            fullTimeJob.setBackground(getResources().getDrawable(R.drawable.full_time_job_sel));
            partTimeJob.setBackground(getResources().getDrawable(R.drawable.part_time_job));
        } else{
            fullTimeJob.setBackground(getResources().getDrawable(R.drawable.full_time_job));
            partTimeJob.setBackground(getResources().getDrawable(R.drawable.part_time_job_sel));
        }
        unemployed.setBackground(getResources().getDrawable(R.drawable.unemployed));
        friendly.setBackground(getResources().getDrawable(R.drawable.friendly_sel));
        unfriendly.setBackground(getResources().getDrawable(R.drawable.unfriendly));
    }

    public void unFriendly(View v){
        job = "unemployed";
        nextButton.setVisibility(View.VISIBLE);
        if (fullOrPart) {
            fullTimeJob.setBackground(getResources().getDrawable(R.drawable.full_time_job_sel));
            partTimeJob.setBackground(getResources().getDrawable(R.drawable.part_time_job));
        } else{
            fullTimeJob.setBackground(getResources().getDrawable(R.drawable.full_time_job));
            partTimeJob.setBackground(getResources().getDrawable(R.drawable.part_time_job_sel));
        }
        unemployed.setBackground(getResources().getDrawable(R.drawable.unemployed));
        friendly.setBackground(getResources().getDrawable(R.drawable.friendly));
        unfriendly.setBackground(getResources().getDrawable(R.drawable.unfriendly_sel));
    }

    public void pickAllergic(View v){
        allergic = true;
        nextButton.setVisibility(View.VISIBLE);
        isAllergic.setBackground(getResources().getDrawable(R.drawable.allergic_sel));
        notAllergic.setBackground(getResources().getDrawable(R.drawable.unallergic));
    }

    public void pickUnallergic(View v){
        allergic = false;
        nextButton.setVisibility(View.VISIBLE);
        isAllergic.setBackground(getResources().getDrawable(R.drawable.allergic));
        notAllergic.setBackground(getResources().getDrawable(R.drawable.unallergic_sel));
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
        if (questionCount == numberOfQuestions[currentCategory] && currentCategory == 3) {
            nextButton.setVisibility(View.GONE);
            //TODO move to the loading screen
        }
        else{
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
    }

    Questionnaire curQS = new Questionnaire(personalStatus, livingArrangement, location, extraAnimals,
            allergic, )
}