package com.example.sscexpensetracker;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Lab 2 Reference Solution: Unit 3 - Layout Types, Basic Widgets & Validation.
 */
public class AddExpenseActivity extends AppCompatActivity {

    private EditText etExpenseTitle;
    private EditText etExpenseAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        etExpenseTitle = findViewById(R.id.etExpenseTitle);
        etExpenseAmount = findViewById(R.id.etExpenseAmount);
        Button btnSaveExpense = findViewById(R.id.btnSaveExpense);

        if (btnSaveExpense != null) {
            btnSaveExpense.setOnClickListener(v -> validateAndSaveExpense());
        }
    }

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
            Toast.makeText(this, "Saved: " + title + " ($" + amount + ")", Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException e) {
            Toast.makeText(this, R.string.error_invalid_amount, Toast.LENGTH_SHORT).show();
        }
    }
}
