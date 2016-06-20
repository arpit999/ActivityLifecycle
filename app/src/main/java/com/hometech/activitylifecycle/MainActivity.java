package com.hometech.activitylifecycle;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "State changed";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: ");
    }

    public void OpenDialog(View view) {

        final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create(); //Read Update
        alertDialog.setTitle("hi");
        alertDialog.setMessage("this is my app");

        alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // here you can add functions
                alertDialog.dismiss();
            }
        });

        alertDialog.show();  //<-- Show dialog
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: " );
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume: ");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i(TAG, "onBackPressed: ");
    }

}
