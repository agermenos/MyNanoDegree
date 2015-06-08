package com.agermenos.mynanodegree.launcher;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * @author Alejandro
 */
public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launcher, menu);
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

    /**
     * Call from Media Streamer button
     * @param view
     */
    public void callMediaStreamer(View view){
        callMessage("This will open Spotify Streamer");
    }

    /**
     * Call from Scores App button
     * @param view
     */
    public void callSuperDuo1(View view){
        callMessage("This will open Scores App");
    }

    /**
     * Call from Library App button
     * @param view
     */
    public void callSuperDuo2(View view){
        callMessage("This will open Library App");
    }

    /**
     * Call from Build It Bigger button
     * @param view
     */
    public void callAntTerminator(View view){
        callMessage("This will open Build It Bigger");
    }

    /**
     * Call from Bacon Reader button
     * @param view
     */
    public void callMaterialize(View view){
        callMessage("This will open Bacon Reader");
    }

    /**
     * Call from My Own App button
     * @param view
     */
    public void callCapStone(View view){
        callMessage("This will open My Own App");
    }

    /**
     * Generic Toaster Method
     * Sends a toast message based on the message
     * @param message the message to display in the toast
     */
    private void callMessage(String message){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
