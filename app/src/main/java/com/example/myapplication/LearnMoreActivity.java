package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class LearnMoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);

        TextView learnMoreText = findViewById(R.id.learnMoreText);
        learnMoreText.setText("Welcome to the Learn More Page!\n\nHere, you can explore more features of our app.");
    }
}
