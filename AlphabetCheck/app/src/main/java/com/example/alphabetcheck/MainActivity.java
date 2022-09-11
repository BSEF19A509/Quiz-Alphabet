package com.example.alphabetcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String sky[]={"b","d","f" ,"h" ,"k" ,"l" ,"t" };
    String grass[]={"a","c","i","e" ,"m","n","o","r" ,"s" ,"u" ,"v" ,"w" ,"x"  };
    String root[]={"g","y","p" ,"j" ,"q","z" };
    String alph[] = {"a","b","c" ,"d" ,"e","f","g","h","i","j" ,"k","l","m","n" ,"o" ,"p" ,"q" ,"r" ,"s","t","u","v" ,"w" ,"x" ,"y" ,"z"};
    TextView alphabet,correct,incorrect;
    Button grassb,rootb,skyb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correct = findViewById(R.id.correct);
        incorrect = findViewById(R.id.incorrect);
        alphabet = findViewById(R.id.alphabets);
        grassb = findViewById(R.id.button);
        rootb = findViewById(R.id.button2);
        skyb = findViewById(R.id.button3);
        int random = (int) (Math.random()*(alph.length - 1));
        alphabet.setText(alph[random]);
        grassb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int corr = 0;
                    for(int i = 0;i<grass.length;i++)
                    {
                        if(alphabet.getText().toString().equals(grass[i]))
                        {
                            corr = 1;
                            break;
                        }
                    }
                  if(corr>0)
                  {
                      incorrect.setVisibility(View.INVISIBLE);
                      correct.setVisibility(View.VISIBLE);
                  }
                  else
                  {
                      correct.setVisibility(View.INVISIBLE);
                      incorrect.setVisibility(View.VISIBLE);
                  }
            }
        });


        rootb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int corr = 0;
                for(int i = 0;i<root.length;i++)
                {
                    if(alphabet.getText().toString().equals(root[i]))
                    {
                        corr = 1;
                        break;
                    }
                }
                if(corr>0)
                {
                    incorrect.setVisibility(View.INVISIBLE);
                    correct.setVisibility(View.VISIBLE);
                }
                else
                {
                    correct.setVisibility(View.INVISIBLE);
                    incorrect.setVisibility(View.VISIBLE);
                }
            }
        });

        skyb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int corr = 0;
                for(int i = 0;i<sky.length;i++)
                {
                    if(alphabet.getText().toString().equals(sky[i]))
                    {
                        corr = 1;
                        break;
                    }
                }
                if(corr>0)
                {
                    incorrect.setVisibility(View.INVISIBLE);
                    correct.setVisibility(View.VISIBLE);
                }
                else
                {
                    correct.setVisibility(View.INVISIBLE);
                    incorrect.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}