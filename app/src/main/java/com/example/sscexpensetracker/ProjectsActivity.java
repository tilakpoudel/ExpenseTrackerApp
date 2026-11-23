package com.example.sscexpensetracker;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * ProjectsActivity displays the list of practical projects and practice pages
 * corresponding to the CACS351 syllabus.
 */
public class ProjectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            setContentView(R.layout.activity_projects);

            // Enable Action Bar Back Return Button
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setTitle("CACS351 Projects");
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
