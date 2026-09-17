package com.example.sscexpensetracker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Lab 1 Reference Solution: Unit 2 - Project Setup, View Hierarchy & Event Handling.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGetStarted = findViewById(R.id.btnGetStarted);
        if (btnGetStarted != null) {
            btnGetStarted.setOnClickListener(v -> {
                Toast.makeText(MainActivity.this, R.string.toast_welcome, Toast.LENGTH_SHORT).show();
            });
        }
    }
}
