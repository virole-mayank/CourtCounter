package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void add3a (View view)
    {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public void add2a (View view)
    {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void addfreea (View view)
    {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }


    public void add3b (View view)
    {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void add2b (View view)
    {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void addfreeb (View view)
    {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void over(View view)
    {
        if(scoreA > scoreB){
            TextView result = (TextView)findViewById(R.id.result);
            result.setText("Team A has won the match !! ");
        }

        else if(scoreA < scoreB){
            TextView result = (TextView)findViewById(R.id.result);
            result.setText("Team B has won the match !! ");
        }
        else
        {
            TextView result = (TextView)findViewById(R.id.result);
            result.setText("IT'S A DRAW !");
        }

    }
}