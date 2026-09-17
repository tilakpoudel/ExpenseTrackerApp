package com.example.sscexpensetracker.lab10;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.sscexpensetracker.R;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Lab 10 Reference Solution: Unit 7 - API Integration, JSON Parsing & Google Maps.
 * 
 * Demonstrates consuming REST APIs, parsing JSON response payloads, 
 * and integrating Google Maps location markers for expenses.
 */
public class ApiAndMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example JSON parsing concept
        parseSampleJsonResponse("{\"currency\":\"NPR\",\"rate\":133.5}");
    }

    /**
     * Parses JSON string payload using JSONObject (Lab 10 concept).
     */
    private void parseSampleJsonResponse(String jsonString) {
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            String currency = jsonObject.getString("currency");
            double rate = jsonObject.getDouble("rate");

            Toast.makeText(this, "API Currency: " + currency + ", Rate: " + rate, Toast.LENGTH_LONG).show();
        } catch (JSONException e) {
            Toast.makeText(this, "JSON Parsing Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
