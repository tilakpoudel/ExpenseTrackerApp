package com.example.sscexpensetracker.lab07;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.example.sscexpensetracker.R;

/**
 * Lab 7 Reference Solution: Unit 5 - Options Menu, Context Menu, AlertDialog & Custom Dialog.
 */
public class DialogAndMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowDialog = findViewById(R.id.btnGetStarted);
        if (btnShowDialog != null) {
            btnShowDialog.setText("Show Alert Dialog");
            btnShowDialog.setOnClickListener(v -> showCustomAlertDialog());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate Options Menu in action bar
        getMenuInflater().inflate(R.menu.main_menu, menu); // Placeholder reference
        return true;
    }

    /**
     * Displays an AlertDialog for user confirmation (Lab 7 concept).
     */
    private void showCustomAlertDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Delete Expense")
                .setMessage("Are you sure you want to delete this expense entry?")
                .setPositiveButton("Yes", (dialog, which) -> {
                    // Action on positive click
                })
                .setNegativeButton("Cancel", null)
                .show();
    }
}
