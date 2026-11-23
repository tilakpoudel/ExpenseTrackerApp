package com.example.sscexpensetracker;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Lab 1: Unit 2 - Android Platform, Environment Setup, Creating Project, View Hierarchy & Event Handling.
 * Navigates to Lab Works and Projects.
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: Called");

        try {
            setContentView(R.layout.activity_main);

            // See Projects Button -> Launches ProjectsActivity (Project list page)
            Button btnSeeProjects = findViewById(R.id.btnSeeProjects);
            if (btnSeeProjects != null) {
                btnSeeProjects.setOnClickListener(v -> {
                    Intent intent = new Intent(MainActivity.this, ProjectsActivity.class);
                    Log.d(TAG, "onCreate: ProjectsActivity called");
                    startActivity(intent);
                });
            }

            // Start Lab Works Button -> Launches LabWorks Activity
            Button btnStartLab = findViewById(R.id.btnStartLab);
            if (btnStartLab != null) {
                btnStartLab.setOnClickListener(v -> {
                    Intent intent = new Intent(MainActivity.this, LabWorks.class);
                    Log.d(TAG, "onCreate: LabWorks activity called");
                    startActivity(intent);
                });
            }

        } catch (Exception e) {
            Log.d(TAG, "onCreate: " + e.getMessage());
            Toast.makeText(this, "Error initializing app: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
