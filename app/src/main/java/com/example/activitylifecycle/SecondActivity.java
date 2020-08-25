package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toast =  Toast.makeText(this, "Secondcreate", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        toast =  Toast.makeText(this, "Secondstart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();    }

    @Override
    protected void onResume() {
        super.onResume();
        toast =  Toast.makeText(this, "Secondresume", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        toast =  Toast.makeText(this, "Secondpause", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }
    @Override
    protected void onStop() {
        Log.d("onStopActivity","onstop");
        super.onStop();
        toast =  Toast.makeText(this, "Secondstop", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        Log.d("onDestoryActivity","ondestroy");
        super.onDestroy();
        toast =  Toast.makeText(this, "Seconddestory", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }


}
