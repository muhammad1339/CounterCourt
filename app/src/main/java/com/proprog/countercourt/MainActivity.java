package com.proprog.countercourt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void hitThreeForA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void hitTwoForA(View view) {
//        NumberFormat numberFormat = NumberFormat.getInstance();
//        numberFormat.setMinimumIntegerDigits(2);
//        numberFormat.setMinimumFractionDigits(2);
//        Log.i("App",numberFormat.format(2));
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }


    public void hitOneForA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void hitThreeForB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void hitTwoForB(View view) {
//        NumberFormat numberFormat = NumberFormat.getInstance();
//        numberFormat.setMinimumIntegerDigits(2);
//        numberFormat.setMinimumFractionDigits(2);
//        Log.i("App",numberFormat.format(2));
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }


    public void hitOneForB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
