package com.dekcomlao.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTA = 0;
    int scoreTB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //////////////Team1111111111111111111111111111111111111111111///////////////////////
    }
    public void addThreeteamA (View view){
        scoreTA = scoreTA + 3;
        displayScoreTeamA(scoreTA);
    }

    public void addTwoA (View view){
        scoreTA = scoreTA + 2;
        displayScoreTeamA(scoreTA);
    }
    public void addoneA (View view){
        scoreTA = scoreTA + 1;
        displayScoreTeamA(scoreTA);
    }
    //
    ////////////////
    public void displayScoreTeamA (int scoreA){
        TextView scoreTeamA = (TextView) findViewById(R.id.TeamA);
        scoreTeamA.setText(String.valueOf(scoreA));
    }
    ////////////////////END TEAmA /////////////////////////////////////////////

    public void displayScoreTeamB (int scoreB){
        TextView scoreTeamB = (TextView) findViewById(R.id.TeamB);
        scoreTeamB.setText(String.valueOf(scoreB));
    }
    public void addThreeteamB (View view){
        scoreTB = scoreTB + 3;
        displayScoreTeamB(scoreTB);
    }

    public void addTwoB (View view){
        scoreTB = scoreTB + 2;
        displayScoreTeamB(scoreTB);
    }
    public void addoneB (View view){
        scoreTB = scoreTB + 1;
        displayScoreTeamB(scoreTB);
    }

    //reset/////////////////
    public void reset (View view){
        scoreTA = 0;
        scoreTB = 0;
        displayScoreTeamA(scoreTA);
        displayScoreTeamB(scoreTB);
    }

}
