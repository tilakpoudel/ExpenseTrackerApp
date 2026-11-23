package com.example.sscexpensetracker;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Lab 1: Unit 2 - Android Platform, Environment Setup, Creating Project, View Hierarchy & Event Handling.
 * Navigates to Lab 2 (AddExpenseActivity).
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: Called");

        try {
            setContentView(R.layout.activity_main);

            Button btnSeeProjects = findViewById(R.id.btnSeeProjects);

            if (btnSeeProjects != null) {
                btnSeeProjects.setOnClickListener(v -> {
                    // Explicit Intent to launch AddExpenseActivity (Lab 2)
                    Intent intent = new Intent(MainActivity.this, AddExpenseActivity.class);
                    Log.d(TAG, "onCreate: add expense activity called");
                    startActivity(intent);
                });
            }

            Button btnStartLab = findViewById(R.id.btnStartLab);

            // TODO:: Start lab work activity
            if (btnStartLab != null) {
                btnStartLab.setOnClickListener(v -> {
                    // Explicit Intent to launch AddExpenseActivity (Lab 2)
                    Intent intent = new Intent(MainActivity.this, LabWorks.class);
                    Log.d(TAG, "onCreate: Lab works activity called");
                    startActivity(intent);
                });
            }

        } catch (Exception e) {
            Log.d(TAG, "onCreate: " + e.getMessage());
            Toast.makeText(this, "Error initializing app: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
