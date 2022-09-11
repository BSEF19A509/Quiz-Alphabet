package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String SelectedTopic = "";
    LinearLayout java;
    LinearLayout php;
    LinearLayout android;
    LinearLayout html ;
    Button start_quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java = findViewById(R.id.layout_java);
        php = findViewById(R.id.layout_php);
        android = findViewById(R.id.layout_android);
        html = findViewById(R.id.layout_html);
        start_quiz = (Button) findViewById(R.id.start);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectedTopic = "Java";
                java.setBackgroundResource(R.drawable.shapeselected);
                php.setBackgroundResource(R.drawable.shape);
                html.setBackgroundResource(R.drawable.shape);
                android.setBackgroundResource(R.drawable.shape);
            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectedTopic = "Php";
                php.setBackgroundResource(R.drawable.shapeselected);
                java.setBackgroundResource(R.drawable.shape);
                html.setBackgroundResource(R.drawable.shape);
                android.setBackgroundResource(R.drawable.shape);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectedTopic = "Html";
                html.setBackgroundResource(R.drawable.shapeselected);
                php.setBackgroundResource(R.drawable.shape);
                java.setBackgroundResource(R.drawable.shape);
                android.setBackgroundResource(R.drawable.shape);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectedTopic = "Android";
                android.setBackgroundResource(R.drawable.shapeselected);
                php.setBackgroundResource(R.drawable.shape);
                html.setBackgroundResource(R.drawable.shape);
                java.setBackgroundResource(R.drawable.shape);
            }
        });

        start_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(SelectedTopic.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please select the topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent  = new Intent(MainActivity.this,QuizActivity2.class);
                    intent.putExtra("selectedTopic",SelectedTopic);
                    startActivity(intent);
                }
            }
        });

    }
}