package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class QuizActivity2 extends AppCompatActivity {

    TextView topicSelected;
    TextView question;
    TextView count;
    TextView correct;
    Button option1,option2,option3,option4,next;
    private  ArrayList<Questionlist> questionlists;
    private int currentquestionPosition = 0;
    private String selectedOptionByUser = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        final String getSelectedTopic = getIntent().getStringExtra("selectedTopic");
        topicSelected = findViewById(R.id.topic2);
        question = findViewById(R.id.question);
        count = findViewById(R.id.count);
        option1 =(Button) findViewById(R.id.option1);
        option2 =(Button) findViewById(R.id.option2);
        option3 =(Button) findViewById(R.id.option3);
        option4 =(Button) findViewById(R.id.option4);
        correct = findViewById(R.id.correct_option);
        next =(Button) findViewById(R.id.next);
        topicSelected.setText(getSelectedTopic);
        questionlists = QuestionBank.getQuestions(getSelectedTopic);
        count.setText((currentquestionPosition)+"/"+questionlists.size());
        question.setText(questionlists.get(currentquestionPosition).getQuestion());
        option1.setText(questionlists.get(currentquestionPosition).getOption1());
        option2.setText(questionlists.get(currentquestionPosition).getOption2());
        option3.setText(questionlists.get(currentquestionPosition).getOption3());
        option4.setText(questionlists.get(currentquestionPosition).getOption4());

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.shapeselected);
                    revealAnswers();
                    questionlists.get(currentquestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.shapeselected);
                    revealAnswers();
                    questionlists.get(currentquestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.shapeselected);
                    revealAnswers();
                    questionlists.get(currentquestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.shapeselected);
                    revealAnswers();
                    questionlists.get(currentquestionPosition).setUserSelectedAnswer(selectedOptionByUser);


                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty())
                    Toast.makeText(QuizActivity2.this, "Please select the option", Toast.LENGTH_SHORT).show();
                else{
                        changeNextQuestion();
                }
            }
        });
    }

    private  void revealAnswers(){
        final String getAnswer = questionlists.get(currentquestionPosition).getAnswer();

        if(option1.getText().toString().trim().toLowerCase().equals(getAnswer.trim().toLowerCase())){
            correct.setText("option1 correct answer");
            correct.setVisibility(View.VISIBLE);
        }
        else if(option2.getText().toString().trim().toLowerCase().equals(getAnswer.trim().toLowerCase())){

            correct.setText("option2 correct answer");
            correct.setVisibility(View.VISIBLE);
        }
        else if(option3.getText().toString().trim().toLowerCase().equals(getAnswer.trim().toLowerCase())){

            correct.setText("option3 correct answer");
            correct.setVisibility(View.VISIBLE);
        }
        else if(option4.getText().toString().trim().toLowerCase().equals(getAnswer.trim().toLowerCase())){

            correct.setText("option4 correct answer");
            correct.setVisibility(View.VISIBLE);
        }
    }

    private int getCorrectAnswers(){
        int correctAnswers = 0;
        for(int i = 0; i<questionlists.size();i++){
            final String getUserSelected = questionlists.get(i).getUserSelectedAnswer();
            final String answer = questionlists.get(i).getAnswer();
            if(getUserSelected.equals(answer)){
                correctAnswers++;
            }
        }
        return correctAnswers;
    }

    private int getWrongAnswers(){
        int wrongAnswers = 0;
        for(int i = 0; i<questionlists.size();i++){
            final String getUserSelected = questionlists.get(i).getUserSelectedAnswer();
            final String answer = questionlists.get(i).getAnswer();
            if(!getUserSelected.equals(answer)){
                wrongAnswers++;
            }
        }
        return wrongAnswers;
    }

    private void changeNextQuestion(){
        currentquestionPosition++;
        if(currentquestionPosition == questionlists.size()){
            next.setText("Submit");
        }
        else if((currentquestionPosition) < questionlists.size()){
            selectedOptionByUser = "";
            correct.setVisibility(View.INVISIBLE);
            option1.setBackgroundResource(R.drawable.shape2);
            option2.setBackgroundResource(R.drawable.shape2);
            option3.setBackgroundResource(R.drawable.shape2);
            option4.setBackgroundResource(R.drawable.shape2);
            count.setText((currentquestionPosition+1)+"/"+questionlists.size());
            question.setText(questionlists.get(currentquestionPosition).getQuestion());
            option1.setText(questionlists.get(currentquestionPosition).getOption1());
            option2.setText(questionlists.get(currentquestionPosition).getOption2());
            option3.setText(questionlists.get(currentquestionPosition).getOption3());
            option4.setText(questionlists.get(currentquestionPosition).getOption4());




        }
        else{
            Intent intent = new Intent(QuizActivity2.this,result.class);
            intent.putExtra("correct",getCorrectAnswers());
            intent.putExtra("wrong",getWrongAnswers());
            startActivity(intent);

            finish();
        }

    }
}