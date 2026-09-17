package com.example.sscexpensetracker;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Lab 3: Unit 3 - Advanced Widgets (Spinner, RadioButton, CheckBox) & Event Handling.
 * AddExpenseActivity manages the enhanced expense form.
 */
public class AddExpenseActivity extends AppCompatActivity {

    private EditText etExpenseTitle;
    private EditText etExpenseAmount;
    private Spinner spinnerCategory;
    private RadioGroup rgPaymentMethod;
    private CheckBox cbRecurring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            // Inflate XML layout for Lab 3 (activity_add_expense.xml inside ScrollView)
            setContentView(R.layout.activity_add_expense);

            // Bind UI widgets by their IDs
            etExpenseTitle = findViewById(R.id.etExpenseTitle);
            etExpenseAmount = findViewById(R.id.etExpenseAmount);
            spinnerCategory = findViewById(R.id.spinnerCategory);
            rgPaymentMethod = findViewById(R.id.rgPaymentMethod);
            cbRecurring = findViewById(R.id.cbRecurring);
            Button btnSaveExpense = findViewById(R.id.btnSaveExpense);

            // Setup Spinner Adapter using string-array resource
            setupCategorySpinner();

            // Set up event handling for the Save button
            if (btnSaveExpense != null) {
                btnSaveExpense.setOnClickListener(v -> validateAndSaveExpense());
            }

        } catch (Exception e) {
            Toast.makeText(this, "Error loading form: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Populates the Category Spinner with items from arrays.xml using an ArrayAdapter.
     */
    private void setupCategorySpinner() {
        if (spinnerCategory != null) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    this,
                    R.array.expense_categories,
                    android.R.layout.simple_spinner_item
            );
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerCategory.setAdapter(adapter);
        }
    }

    /**
     * Validates user input from all form widgets (EditText, Spinner, RadioGroup, CheckBox)
     * and processes saving the expense.
     */
    private void validateAndSaveExpense() {
        String title = etExpenseTitle.getText().toString().trim();
        String amountStr = etExpenseAmount.getText().toString().trim();
        String category = spinnerCategory != null ? spinnerCategory.getSelectedItem().toString() : "";

        // 1. Validate empty text fields
        if (TextUtils.isEmpty(title) || TextUtils.isEmpty(amountStr)) {
            Toast.makeText(this, R.string.error_empty_fields, Toast.LENGTH_SHORT).show();
            return;
        }

        // 2. Validate Spinner selection (index 0 is "Select Category")
        if (spinnerCategory == null || spinnerCategory.getSelectedItemPosition() == 0) {
            Toast.makeText(this, R.string.error_select_category, Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);

            if (amount <= 0) {
                Toast.makeText(this, R.string.error_invalid_amount, Toast.LENGTH_SHORT).show();
                return;
            }

            // 3. Get Selected Payment Method from RadioGroup
            String paymentMethod = "Cash";
            if (rgPaymentMethod != null && rgPaymentMethod.getCheckedRadioButtonId() != -1) {
                RadioButton selectedRadioButton = findViewById(rgPaymentMethod.getCheckedRadioButtonId());
                if (selectedRadioButton != null) {
                    paymentMethod = selectedRadioButton.getText().toString();
                }
            }

            // 4. Get CheckBox state for recurring expense
            boolean isRecurring = cbRecurring != null && cbRecurring.isChecked();

            // Build summary message
            String successMessage = getString(R.string.success_expense_saved) + "\n" +
                    "Title: " + title + "\n" +
                    "Amount: $" + amount + "\n" +
                    "Category: " + category + "\n" +
                    "Payment: " + paymentMethod + "\n" +
                    "Recurring: " + (isRecurring ? "Yes" : "No");

            Toast.makeText(this, successMessage, Toast.LENGTH_LONG).show();

            // Reset form fields
            etExpenseTitle.setText("");
            etExpenseAmount.setText("");
            spinnerCategory.setSelection(0);
            if (rgPaymentMethod != null) {
                rgPaymentMethod.check(R.id.rbCash);
            }
            if (cbRecurring != null) {
                cbRecurring.setChecked(false);
            }

        } catch (NumberFormatException e) {
            Toast.makeText(this, R.string.error_invalid_amount, Toast.LENGTH_SHORT).show();
        }
    }
}
