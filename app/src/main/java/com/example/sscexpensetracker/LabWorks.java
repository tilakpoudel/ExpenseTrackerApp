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
 * for CACS351 Mobile Programming with modern CTA buttons.
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

            // Unit 2 CTA: Open Lab 1 (MainActivity / Setup)
            Button btnOpenUnit2 = findViewById(R.id.btnOpenUnit2);
            if (btnOpenUnit2 != null) {
                btnOpenUnit2.setOnClickListener(v -> {
                    Intent intent = new Intent(LabWorks.this, MainActivity.class);
                    startActivity(intent);
                });
            }

            // Unit 3 CTA: Open Lab 2 & 3 (AddExpenseActivity / Form)
            Button btnOpenUnit3 = findViewById(R.id.btnOpenUnit3);
            if (btnOpenUnit3 != null) {
                btnOpenUnit3.setOnClickListener(v -> {
                    Intent intent = new Intent(LabWorks.this, AddExpenseActivity.class);
                    startActivity(intent);
                });
            }

            // Unit 4 CTA: Lifecycle Demo
            Button btnOpenUnit4 = findViewById(R.id.btnOpenUnit4);
            if (btnOpenUnit4 != null) {
                btnOpenUnit4.setOnClickListener(v -> {
                    Toast.makeText(this, "Ref: lab_reference/lab04/LifecycleActivity.java", Toast.LENGTH_LONG).show();
                });
            }

            // Unit 5 CTA: Fragments & Dialogs Demo
            Button btnOpenUnit5 = findViewById(R.id.btnOpenUnit5);
            if (btnOpenUnit5 != null) {
                btnOpenUnit5.setOnClickListener(v -> {
                    Toast.makeText(this, "Ref: lab_reference/lab06/ & lab07/", Toast.LENGTH_LONG).show();
                });
            }

            // Unit 6 CTA: RecyclerView Demo
            Button btnOpenUnit6 = findViewById(R.id.btnOpenUnit6);
            if (btnOpenUnit6 != null) {
                btnOpenUnit6.setOnClickListener(v -> {
                    Toast.makeText(this, "Ref: lab_reference/lab08/ExpenseAdapter.java", Toast.LENGTH_LONG).show();
                });
            }

            // Unit 7 CTA: SQLite & API Demo
            Button btnOpenUnit7 = findViewById(R.id.btnOpenUnit7);
            if (btnOpenUnit7 != null) {
                btnOpenUnit7.setOnClickListener(v -> {
                    Toast.makeText(this, "Ref: lab_reference/lab09/ & lab10/", Toast.LENGTH_LONG).show();
                });
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
