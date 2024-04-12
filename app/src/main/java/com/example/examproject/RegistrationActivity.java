package com.example.examproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class RegistrationActivity extends AppCompatActivity {

    private EditText editTextFirstName, editTextLastName, editTextEmail, School, CourseAndYear, contactNo;
    private RadioGroup radioGroupGender;
    private Button buttonDateOfBirth, buttonSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmail = findViewById(R.id.editTextEmail);
        School = findViewById(R.id.School);
        CourseAndYear = findViewById(R.id.CourseAndYear);
        contactNo = findViewById(R.id.contactNo);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        buttonDateOfBirth = findViewById(R.id.buttonDateOfBirth);
        buttonSignUp = findViewById(R.id.buttonSignUp);

        buttonDateOfBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register() {
        String firstName = editTextFirstName.getText().toString();
        String lastName = editTextLastName.getText().toString();
        String email = editTextEmail.getText().toString();
        String school = School.getText().toString();
        String courseAndYear = CourseAndYear.getText().toString();
        String contactNumber = contactNo.getText().toString();

        int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
        RadioButton radioButtonGender = findViewById(selectedGenderId);
        String gender = radioButtonGender.getText().toString();

        // Validate if all fields are filled
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || school.isEmpty() || courseAndYear.isEmpty() || contactNumber.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // You can proceed with the registration process here
        // For demonstration purposes, let's just display the data in another activity

        Intent intent = new Intent(this, DisplayRegistration.class);
        intent.putExtra("firstName", firstName);
        intent.putExtra("lastName", lastName);
        intent.putExtra("email", email);
        intent.putExtra("school", school);
        intent.putExtra("courseAndYear", courseAndYear);
        intent.putExtra("contactNumber", contactNumber);
        intent.putExtra("gender", gender);
        startActivity(intent);
    }

    private void showDatePickerDialog() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(RegistrationActivity.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        // Handle date selection
                        String dateOfBirth = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
                        buttonDateOfBirth.setText(dateOfBirth);
                    }
                }, year, month, day);
        datePickerDialog.show();
    }
}


