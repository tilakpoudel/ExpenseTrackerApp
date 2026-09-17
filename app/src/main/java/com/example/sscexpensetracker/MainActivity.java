package com.example.sscexpensetracker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Lab 1: Unit 2 - Android Platform, Environment Setup, Creating Project, View Hierarchy & Event Handling.
 * 
 * MainActivity is the default entry point Activity of the application.
 * It extends AppCompatActivity to support modern Material Design themes on older Android versions.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            // Inflate the XML layout file (activity_main.xml) into the Activity's view hierarchy
            setContentView(R.layout.activity_main);

            // Initialize UI widgets by finding them using their unique resource IDs
            Button btnGetStarted = findViewById(R.id.btnGetStarted);

            // Set up event handling (Button Click Listener using Java lambda)
            if (btnGetStarted != null) {
                btnGetStarted.setOnClickListener(v -> {
                    // Display a Toast message confirming successful app launch and interaction
                    Toast.makeText(MainActivity.this, 
                            R.string.toast_welcome, 
                            Toast.LENGTH_SHORT).show();
                });
            }
        } catch (Exception e) {
            // Proper error handling for initialization issues
            Toast.makeText(this, "Error initializing app: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
