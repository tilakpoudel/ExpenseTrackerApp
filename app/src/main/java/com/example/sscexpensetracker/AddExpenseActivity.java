package com.example.sscexpensetracker;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Lab 2: Unit 3 - Layout Types, Basic Widgets & Event Handling.
 * AddExpenseActivity manages the form UI where users input expense details.
 */
public class AddExpenseActivity extends AppCompatActivity {

    private EditText etExpenseTitle;
    private EditText etExpenseAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            // Inflate XML layout for Lab 2 (activity_add_expense.xml)
            setContentView(R.layout.activity_add_expense);

            // Bind UI widgets by their IDs
            etExpenseTitle = findViewById(R.id.etExpenseTitle);
            etExpenseAmount = findViewById(R.id.etExpenseAmount);
            Button btnSaveExpense = findViewById(R.id.btnSaveExpense);

            // Set up event handling for the Save button
            if (btnSaveExpense != null) {
                btnSaveExpense.setOnClickListener(v -> validateAndSaveExpense());
            }

        } catch (Exception e) {
            Toast.makeText(this, "Error loading form: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Validates user input from EditText widgets and processes saving the expense.
     * Demonstrates proper error handling and conditional validation.
     */
    private void validateAndSaveExpense() {
        String title = etExpenseTitle.getText().toString().trim();
        String amountStr = etExpenseAmount.getText().toString().trim();

        if (TextUtils.isEmpty(title) || TextUtils.isEmpty(amountStr)) {
            Toast.makeText(this, R.string.error_empty_fields, Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);

            if (amount <= 0) {
                Toast.makeText(this, R.string.error_invalid_amount, Toast.LENGTH_SHORT).show();
                return;
            }

            String successMessage = getString(R.string.success_expense_saved) + "\n" +
                    "Title: " + title + "\n" +
                    "Amount: $" + amount;

            Toast.makeText(this, successMessage, Toast.LENGTH_LONG).show();

            etExpenseTitle.setText("");
            etExpenseAmount.setText("");

        } catch (NumberFormatException e) {
            Toast.makeText(this, R.string.error_invalid_amount, Toast.LENGTH_SHORT).show();
        }
    }
}
