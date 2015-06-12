package com.example.barbarossa.nd_0_portofolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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


    public void clickSpotifyStreamer(View view) {
        // Do something in response to button click
        showWillLaunchToast("Spotify Streamer");
    }

    public void clickScoresApp(View view) {
        // Do something in response to button click
        showWillLaunchToast("Scores App");
    }

    public void clickLibraryApp(View view) {
        // Do something in response to button click
        showWillLaunchToast("Library App");
    }

    public void clickBuildItBigger(View view) {
        // Do something in response to button click
        showWillLaunchToast("Build It Bigger");
    }

    public void clickBaconReader(View view) {
        // Do something in response to button click
        showWillLaunchToast("Bacon Reader");
    }

    public void clickCapstoneApp(View view) {
        // Do something in response to button click
        showWillLaunchToast("My Own App");
    }

    public void showWillLaunchToast(String appTitle) {
        Toast toast = Toast.makeText(
                MainActivity.this,
                "This button will launch " + appTitle + "!",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
