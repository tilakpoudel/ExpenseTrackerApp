package com.example.sscexpensetracker.lab04;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.sscexpensetracker.R;

/**
 * Lab 4 Reference Solution: Unit 4 - Activity Lifecycle & Multiple Activities.
 * 
 * Demonstrates the Android Activity Lifecycle callback methods:
 * onCreate -> onStart -> onResume -> (Running) -> onPause -> onStop -> onDestroy.
 */
public class LifecycleActivity extends AppCompatActivity {

    private static final String TAG = "ExpenseLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Activity is created");
        Toast.makeText(this, "Lifecycle: onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Activity is becoming visible");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Activity is in the foreground and interactive");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Activity is losing focus (user switching apps/dialog)");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: Activity is no longer visible to the user");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: Activity is being destroyed and memory reclaimed");
    }
}
