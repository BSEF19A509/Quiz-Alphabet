package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView correct_ans = findViewById(R.id.correct_ans);
        TextView incorrect_ans = findViewById(R.id.incorrect_ans);

        final int correct = getIntent().getIntExtra("correct",0);
        final int incorrect = getIntent().getIntExtra("wrong",0);

        correct_ans.setText("correct answers : " + String.valueOf(correct));
        incorrect_ans.setText("incorrect answers : " + String.valueOf(incorrect));
    }
}