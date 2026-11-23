package com.example.sscexpensetracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * ProjectsActivity displays the list of practical projects and practice pages
 * with modern cards and CTA buttons.
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

            // CTA: Open Expense Tracker Form (Phase 1 & 2)
            Button btnOpenExpenseForm = findViewById(R.id.btnOpenExpenseForm);
            if (btnOpenExpenseForm != null) {
                btnOpenExpenseForm.setOnClickListener(v -> {
                    Intent intent = new Intent(ProjectsActivity.this, AddExpenseActivity.class);
                    startActivity(intent);
                });
            }

            // CTA: Open Full Expense Dashboard Scaffold
            Button btnOpenProject2 = findViewById(R.id.btnOpenProject2);
            if (btnOpenProject2 != null) {
                btnOpenProject2.setText("Open Expense Dashboard");
                btnOpenProject2.setOnClickListener(v -> {
                    Intent intent = new Intent(ProjectsActivity.this, ExpenseDashboardActivity.class);
                    startActivity(intent);
                });
            }

            // CTA: Project 3
            Button btnOpenProject3 = findViewById(R.id.btnOpenProject3);
            if (btnOpenProject3 != null) {
                btnOpenProject3.setOnClickListener(v -> {
                    Toast.makeText(this, "Ref: lab_reference/lab09/ExpenseDBHelper.java", Toast.LENGTH_SHORT).show();
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
