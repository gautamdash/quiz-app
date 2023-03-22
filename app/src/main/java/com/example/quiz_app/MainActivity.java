package com.example.quiz_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView total_questionTextView;
    TextView questionTextView;
    Button ans_a,ans_b,ans_c,ans_d;
    Button submit;


    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       total_questionTextView=findViewById(R.id.total_question);
       questionTextView=findViewById(R.id.question);
        ans_a = findViewById(R.id.ans_a);
        ans_b = findViewById(R.id.ans_b);
        ans_c = findViewById(R.id.ans_c);
        ans_d = findViewById(R.id.ans_d);
        submit = findViewById(R.id.submit);
ans_a.setOnClickListener(this);
ans_b.setOnClickListener(this);
ans_c.setOnClickListener(this);
ans_d.setOnClickListener(this);
submit.setOnClickListener(this);
total_questionTextView.setText("Total question :"+totalQuestion);
loadNewQuestion();
    }

    @Override
    public void onClick(View view) {
        ans_a.setBackgroundColor(Color.WHITE);
        ans_b.setBackgroundColor(Color.WHITE);
        ans_c.setBackgroundColor(Color.WHITE);
        ans_d.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit){
            if(selectedAnswer.equals(QuestionAnswer.correctanswer[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);

        }

    }

        void loadNewQuestion(){

            if(currentQuestionIndex == totalQuestion ){
                finishQuiz();
                return;
            }
            questionTextView.setText(QuestionAnswer.question[currentQuestionIndex]);
            ans_a.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
            ans_b.setText(QuestionAnswer.choices[currentQuestionIndex][1]);
            ans_c.setText(QuestionAnswer.choices[currentQuestionIndex][2]);
            ans_d.setText(QuestionAnswer.choices[currentQuestionIndex][3]);

        }

    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.60){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();


    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }

}

