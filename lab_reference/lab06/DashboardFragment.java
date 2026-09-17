package com.example.sscexpensetracker.lab06;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.sscexpensetracker.R;

/**
 * Lab 6 Reference Solution: Unit 5 - Fragments, Fragment Lifecycle & FragmentManager.
 * 
 * Fragments represent reusable modular UI components inside an Activity.
 */
public class DashboardFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment layout XML
        View view = inflater.inflate(R.layout.activity_main, container, false);

        TextView tv = view.findViewById(R.id.tvWelcomeMessage);
        if (tv != null) {
            tv.setText("Dashboard Fragment View");
        }

        return view;
    }
}
