package com.example.examproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_registration);

        Intent intent = getIntent();

        TextView textViewFirstName = findViewById(R.id.textViewFirstName);
        TextView textViewLastName = findViewById(R.id.textViewLastName);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewSchool = findViewById(R.id.textViewSchool);
        TextView textViewCourseAndYear = findViewById(R.id.textViewCourseAndYear);
        TextView textViewContactNumber = findViewById(R.id.textViewContactNo);
        TextView textViewGender = findViewById(R.id.textViewGender);

        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String email = intent.getStringExtra("email");
        String school = intent.getStringExtra("school");
        String courseAndYear = intent.getStringExtra("courseAndYear");
        String contactNumber = intent.getStringExtra("contactNumber");
        String gender = intent.getStringExtra("gender");

        textViewFirstName.setText("First Name: " + firstName);
        textViewLastName.setText("Last Name: " + lastName);
        textViewEmail.setText("Email: " + email);
        textViewSchool.setText("School: " + school);
        textViewCourseAndYear.setText("Course and Year: " + courseAndYear);
        textViewContactNumber.setText("Contact Number: " + contactNumber);
        textViewGender.setText("Gender: " + gender);
    }
}
