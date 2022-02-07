package com.example.mythirdtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
// activity for finish
public class ResultActivity extends AppCompatActivity {
    TextView txtCorrectText ;
    TextView txtPercentageText;

    private int totalQuestions;
    private int finalScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txtCorrectText = findViewById(R.id.correct_textview);
        txtPercentageText = findViewById(R.id.percentage_textview);

        Intent intent = getIntent();
        totalQuestions = intent.getIntExtra("totalQuestions",0);
        finalScore = intent.getIntExtra("finalScore",0);

        int mPercentageScore = finalScore * 100 / totalQuestions;

        txtPercentageText.setText(String.format("%s%%",Integer.toString(Integer.valueOf(mPercentageScore))));
        String final_score_Text = getString(R.string.txtCorrectScore,finalScore,totalQuestions);
        txtCorrectText.setText(final_score_Text);
    }

    public void restartGame(View view) {

    super.onBackPressed();
    }
}