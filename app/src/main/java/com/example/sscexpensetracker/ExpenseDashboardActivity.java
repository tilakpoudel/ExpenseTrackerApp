package com.example.sscexpensetracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * ExpenseDashboardActivity serves as the full scaffold dashboard for the Expense Tracker app.
 * It provides UI placeholders and feature cards for Add Expense, RecyclerView List/Table,
 * Filters, Google Maps, and Data Export, which will be implemented progressively across labs.
 */
public class ExpenseDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            setContentView(R.layout.activity_expense_dashboard);

            // Enable Action Bar Back Return Button
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setTitle("Expense Tracker Dashboard");
            }

            // 1. Add Expense Action -> Opens AddExpenseActivity
            Button btnAddExpenseAction = findViewById(R.id.btnAddExpenseAction);
            if (btnAddExpenseAction != null) {
                btnAddExpenseAction.setOnClickListener(v -> {
                    Intent intent = new Intent(ExpenseDashboardActivity.this, AddExpenseActivity.class);
                    startActivity(intent);
                });
            }

            // 2. View List / Table Action (Lab 8 Scaffold)
            Button btnViewListAction = findViewById(R.id.btnViewListAction);
            if (btnViewListAction != null) {
                btnViewListAction.setOnClickListener(v -> {
                    Toast.makeText(this, "Lab 8 Scaffold: RecyclerView Expense List & Table view.", Toast.LENGTH_SHORT).show();
                });
            }

            // 3. Filter Action (Lab 6/7 Scaffold)
            Button btnFilterAction = findViewById(R.id.btnFilterAction);
            if (btnFilterAction != null) {
                btnFilterAction.setOnClickListener(v -> {
                    Toast.makeText(this, "Lab 6/7 Scaffold: Week/Month/Category filtering.", Toast.LENGTH_SHORT).show();
                });
            }

            // 4. Map Action (Lab 10 Scaffold)
            Button btnMapAction = findViewById(R.id.btnMapAction);
            if (btnMapAction != null) {
                btnMapAction.setOnClickListener(v -> {
                    Toast.makeText(this, "Lab 10 Scaffold: Google Maps geotagged expenses.", Toast.LENGTH_SHORT).show();
                });
            }

            // 5. Export Action (Lab 9 Scaffold)
            Button btnExportAction = findViewById(R.id.btnExportAction);
            if (btnExportAction != null) {
                btnExportAction.setOnClickListener(v -> {
                    Toast.makeText(this, "Lab 9 Scaffold: Export to CSV/PDF from SQLite database.", Toast.LENGTH_SHORT).show();
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
