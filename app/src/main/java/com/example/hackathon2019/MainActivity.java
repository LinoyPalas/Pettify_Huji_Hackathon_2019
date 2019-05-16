package com.example.hackathon2019;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, QuestionActivity.class);
                startActivity(i);
            }
        }, 3000);

//        Button questionsActivityBtn = (Button) findViewById(R.id.goToQuestion);
//        questionsActivityBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent startIntent = new Intent(getApplicationContext(), QuestionActivity.class);
//                startActivity(startIntent);
//            }
//        });
    }
}
