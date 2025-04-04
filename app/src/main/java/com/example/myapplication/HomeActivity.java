package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private TextView welcomeText;
    private Button learnMoreButton, profileButton, logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcomeText = findViewById(R.id.welcomeText);
        learnMoreButton = findViewById(R.id.learnMoreButton);
        profileButton = findViewById(R.id.profileButton);
        logoutButton = findViewById(R.id.logoutButton);

        // Get username from Intent
        String username = getIntent().getStringExtra("USERNAME");
        welcomeText.setText("Welcome, " + username + "!");

        // Learn More button action
        learnMoreButton.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, LearnMoreActivity.class));
        });

        // Profile button action (Replace with actual profile activity)
        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            intent.putExtra("USERNAME", username);
            startActivity(intent);
        });

        // Logout button action (Redirect to Login)
        logoutButton.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, MainActivity.class));
            finish();
        });
    }
}
