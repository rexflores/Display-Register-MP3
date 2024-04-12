package com.example.examproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class FavoritesActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        // Initialize views
        ImageView artist1ImageView = findViewById(R.id.artist1ImageView);
        TextView artist1NameTextView = findViewById(R.id.artist1NameTextView);
        ImageView artist2ImageView = findViewById(R.id.artist2ImageView);
        TextView artist2NameTextView = findViewById(R.id.artist2NameTextView);
        ImageView food1ImageView = findViewById(R.id.food1ImageView);
        TextView food1NameTextView = findViewById(R.id.food1NameTextView);
        ImageView food2ImageView = findViewById(R.id.food2ImageView);
        TextView food2NameTextView = findViewById(R.id.food2NameTextView);

        // Set artist and food images
        artist1ImageView.setImageResource(R.drawable.lany);
        artist2ImageView.setImageResource(R.drawable.edsheeran);
        food1ImageView.setImageResource(R.drawable.sinigang);
        food2ImageView.setImageResource(R.drawable.adobo);

        // Set artist and food names
        artist1NameTextView.setText("Lany");
        artist2NameTextView.setText("Ed Sheeran");
        food1NameTextView.setText("Sinigang");
        food2NameTextView.setText("Adobong Manok");
    }
}

