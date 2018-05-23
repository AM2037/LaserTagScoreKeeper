package com.example.android.lasertagscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

@SuppressWarnings("RedundantCast")
public class MainActivity extends AppCompatActivity {

    //global int that tracks points for Individual
    private int individualPoints = 0;

    //global int that tracks points for Team
    private int teamPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
    Increase individual points by 200
     */
    public void addTwoHundredForIndividual(View v) {
        individualPoints = individualPoints + 200;
        displayForIndividualPoints(individualPoints);
    }

    /*
    Decrease individual points by 100.
     */
    public void loseHundredForIndividual(View v) {
        individualPoints = individualPoints - 100;
        displayForIndividualPoints(individualPoints);
    }

    /*
    Decrease individual points by 100.
     */
    public void loseOneHundredForIndividual(View v) {
        individualPoints = individualPoints - 100;
        displayForIndividualPoints(individualPoints);
    }

    /*
    Increase individual points by 1,000.
    */
    public void addThousandForIndividual(View v) {
        individualPoints = individualPoints + 1000;
        displayForIndividualPoints(individualPoints);
    }

    /*
    Increase team points by 2.
     */
    public void addTwoForTeam(View v) {
        teamPoints = teamPoints + 2;
        displayForTeam(teamPoints);
    }

    /*
    Decrease team points by 1.
     */
    public void loseOneForTeam(View v) {
        teamPoints = teamPoints - 1;
        displayForTeam(teamPoints);
    }

    /*
    Decrease team points by 1.
     */
    public void loseOnePointForTeam(View v) {
        teamPoints = teamPoints - 1;
        displayForTeam(teamPoints);
    }

    /*
    Increase team points by 10.
     */
    public void addTenForTeam(View v) {
        teamPoints = teamPoints + 10;
        displayForTeam(teamPoints);
    }

    /*
    Resets scores for both individual and team back to 0. Display AFTER setting to 0 as shown below.
     */
    public void resetPoints(View v) {
        individualPoints = 0;
        teamPoints = 0;
        displayForIndividualPoints(individualPoints);
        displayForTeam(teamPoints);
    }

    /*
    Displays tag opponent score for Individual.
     */
    public void displayForIndividualPoints(int score) {
        TextView scoreView = (TextView) findViewById(R.id.individual_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
    Displays tag opponent score for Team.
     */
    public void displayForTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_score);
        scoreView.setText(String.valueOf(score));
    }

}

//changed onClick attribute on reset button to resetPoints from resetScore
/*
currently displaying the new total to the current quantity shown for each button. It adds or takes
away from the score each time you click. Maybe display total for individual and team ONCE which
increments and decrements according to the buttons.
 */
