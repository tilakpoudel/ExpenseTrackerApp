package com.example.sscexpensetracker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Lab 1: Unit 2 - Android Platform, Environment Setup, Creating Project, View Hierarchy & Event Handling.
 * Navigates to Lab 2 (AddExpenseActivity).
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            setContentView(R.layout.activity_main);

            Button btnGetStarted = findViewById(R.id.btnGetStarted);

            if (btnGetStarted != null) {
                btnGetStarted.setOnClickListener(v -> {
                    // Explicit Intent to launch AddExpenseActivity (Lab 2)
                    Intent intent = new Intent(MainActivity.this, AddExpenseActivity.class);
                    startActivity(intent);
                });
            }
        } catch (Exception e) {
            Toast.makeText(this, "Error initializing app: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
