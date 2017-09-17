package com.proprog.countercourt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(7);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void hitThreeForA(View view) {
        displayForTeamA(3);
    }

    public void hitTwoForA(View view) {
//        NumberFormat numberFormat = NumberFormat.getInstance();
//        numberFormat.setMinimumIntegerDigits(2);
//        numberFormat.setMinimumFractionDigits(2);
//        Log.i("App",numberFormat.format(2));
        displayForTeamA(2);
    }


    public void hitOneForA(View view) {
        displayForTeamA(1);
    }

}
