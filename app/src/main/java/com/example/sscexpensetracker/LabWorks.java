package com.example.sscexpensetracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * LabWorks Activity displays unit-wise lab works, concepts, and real examples
 * for CACS351 Mobile Programming.
 */
public class LabWorks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            setContentView(R.layout.activity_lab_works);

            // Enable Action Bar Back Return Button
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setTitle("CACS351 Lab Works");
            }

            // Button to navigate to Projects Activity
            Button btnGoToProjects = findViewById(R.id.btnGoToProjects);
            if (btnGoToProjects != null) {
                btnGoToProjects.setOnClickListener(v -> {
                    Intent intent = new Intent(LabWorks.this, ProjectsActivity.class);
                    startActivity(intent);
                });
            }

        } catch (Exception e) {
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle Action Bar Up/Back button click
        if (item.getItemId() == android.R.id.home) {
            finish(); // Return back to previous activity
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
