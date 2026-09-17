package com.example.sscexpensetracker.lab01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.sscexpensetracker.R;

/**
 * Lab 1 Reference Solution: Unit 2 - Android Platform, Environment Setup,
 * Creating Project, View Hierarchy, Widget Attributes, String Resources & Event Handling.
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
