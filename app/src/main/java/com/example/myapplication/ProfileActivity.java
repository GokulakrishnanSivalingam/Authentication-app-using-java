package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    private TextView usernameTextView, emailTextView, mobileTextView;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        usernameTextView = findViewById(R.id.usernameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        mobileTextView = findViewById(R.id.mobileTextView);
        logoutButton = findViewById(R.id.logoutButton);

        // Get user details from Intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        String email = intent.getStringExtra("EMAIL");
        String mobile = intent.getStringExtra("MOBILE");

        // Set user details
        usernameTextView.setText("Welcome, " + username);
        emailTextView.setText("Email: " + email);
        mobileTextView.setText("Mobile: " + mobile);

        // Logout button (Redirects to Login)
        logoutButton.setOnClickListener(v -> {
            Intent logoutIntent = new Intent(ProfileActivity.this, MainActivity.class);
            logoutIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(logoutIntent);
        });
    }
}
