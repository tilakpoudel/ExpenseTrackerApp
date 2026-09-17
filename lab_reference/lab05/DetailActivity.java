package com.example.sscexpensetracker.lab05;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.sscexpensetracker.R;

/**
 * Lab 5 Reference Solution: Unit 4 - Intents, Passing Data & Getting Results.
 * 
 * Receives data passed via Explicit Intent extras from the calling Activity,
 * displays them, and can return result data back to the parent Activity.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // For reference illustration

        TextView tvTitle = findViewById(R.id.tvWelcomeMessage);

        // Retrieve data passed from previous Activity via Intent extras
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("EXPENSE_TITLE")) {
            String title = intent.getStringExtra("EXPENSE_TITLE");
            double amount = intent.getDoubleExtra("EXPENSE_AMOUNT", 0.0);

            if (tvTitle != null) {
                tvTitle.setText("Expense: " + title + " ($" + amount + ")");
            }
        }

        // Returning result back to caller Activity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("RESULT_STATUS", "SUCCESS");
        setResult(RESULT_OK, resultIntent);
    }
}
