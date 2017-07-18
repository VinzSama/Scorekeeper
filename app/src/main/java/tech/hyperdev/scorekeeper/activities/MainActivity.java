package tech.hyperdev.scorekeeper.activities;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            ScoreFragment mSfScore1 = ScoreFragment.newInstance(getString(R.string.team_1));
            ScoreFragment mSfScore2 = ScoreFragment.newInstance(getString(R.string.team_2));

            getSupportFragmentManager().beginTransaction().replace(R.id.frTeam1,mSfScore1).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.frTeam2,mSfScore2).commit();

/*
            mSfScore1.setTeam_name(getString(R.string.team_1));
            mSfScore2.setTeam_name(getString(R.string.team_2));*/


    }
}
