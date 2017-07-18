package tech.hyperdev.scorekeeper.activities;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.Utils;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);

        ScoreFragment mSfScore1 = ScoreFragment.newInstance(getString(R.string.team_1));
        ScoreFragment mSfScore2 = ScoreFragment.newInstance(getString(R.string.team_2));

        getSupportFragmentManager().beginTransaction().replace(R.id.frTeam1, mSfScore1).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.frTeam2, mSfScore2).commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mode_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.dayTheme:
                Utils.changeToTheme(this, 0);
                Toast.makeText(this, "dayTheme", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nightTheme:
                Utigls.changeToTheme(this, 1);
                Toast.makeText(this, "nightTheme", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }

}
