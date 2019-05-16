package com.example.hackathon2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button questionsActivityBtn = (Button) findViewById(R.id.goToQuestion);
        questionsActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), QuestionActivity.class);
                startActivity(startIntent);
            }
        });
    }

//        Button addActivityBtn = findViewById(R.id.AddBtn);
//        addActivityBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText t1 = (EditText) findViewById(R.id.firstNumEditText);
//                float num1 = Float.parseFloat(t1.getText() + "");
//                TextView t2 = findViewById(R.id.secondNumEditText);
//                float num2 = Float.parseFloat(t2.getText() + "");
//                float res = num1 + num2;
//
//                TextView t3 = findViewById(R.id.resultLabel);
//                String resAsStr = getString(R.string.add_result, res);
//                t3.setText(resAsStr);
//            }
//        });

}
