package com.example.pract_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView welcomeTextView = findViewById(R.id.welcome_message);
        welcomeTextView.setText(getString(R.string.welcome_message));
    }
    @Override
    protected void onDestroy (){
        super.onDestroy();
        Log.i("MyActivity", "Destroyed");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MyActivity", "Started");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MyActivity", "Resumed");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MyActivity", "Paused");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MyActivity", "Stoped");
    }
}