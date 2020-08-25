package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Neha","Neha");

    }

    @Override
    protected void onStart() {
        Log.d("Activity","onstart");
        super.onStart();
    }

    @Override
    protected void onResume() {

        Log.d("Activity","onresume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity","onpause");
    }

    @Override
    protected void onStop() {
        Log.d("Activity","onstop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Activity","ondestroy");
        super.onDestroy();
    }
}