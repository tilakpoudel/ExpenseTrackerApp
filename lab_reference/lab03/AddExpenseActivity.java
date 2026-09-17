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
 * Lab 3 Reference Solution: Advanced Widgets (Spinner, RadioButton, CheckBox).
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
        setContentView(R.layout.activity_add_expense);

        etExpenseTitle = findViewById(R.id.etExpenseTitle);
        etExpenseAmount = findViewById(R.id.etExpenseAmount);
        spinnerCategory = findViewById(R.id.spinnerCategory);
        rgPaymentMethod = findViewById(R.id.rgPaymentMethod);
        cbRecurring = findViewById(R.id.cbRecurring);
        Button btnSaveExpense = findViewById(R.id.btnSaveExpense);

        setupCategorySpinner();

        if (btnSaveExpense != null) {
            btnSaveExpense.setOnClickListener(v -> validateAndSaveExpense());
        }
    }

    private void setupCategorySpinner() {
        if (spinnerCategory != null) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    this, R.array.expense_categories, android.R.layout.simple_spinner_item
            );
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerCategory.setAdapter(adapter);
        }
    }

    private void validateAndSaveExpense() {
        String title = etExpenseTitle.getText().toString().trim();
        String amountStr = etExpenseAmount.getText().toString().trim();
        String category = spinnerCategory != null ? spinnerCategory.getSelectedItem().toString() : "";

        if (TextUtils.isEmpty(title) || TextUtils.isEmpty(amountStr)) {
            Toast.makeText(this, R.string.error_empty_fields, Toast.LENGTH_SHORT).show();
            return;
        }

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

            String paymentMethod = "Cash";
            if (rgPaymentMethod != null && rgPaymentMethod.getCheckedRadioButtonId() != -1) {
                RadioButton rb = findViewById(rgPaymentMethod.getCheckedRadioButtonId());
                if (rb != null) paymentMethod = rb.getText().toString();
            }

            boolean isRecurring = cbRecurring != null && cbRecurring.isChecked();

            Toast.makeText(this, "Saved: " + title + " ($" + amount + ") [" + category + ", " + paymentMethod + "]", Toast.LENGTH_LONG).show();
        } catch (NumberFormatException e) {
            Toast.makeText(this, R.string.error_invalid_amount, Toast.LENGTH_SHORT).show();
        }
    }
}
