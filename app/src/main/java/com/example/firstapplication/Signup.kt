package com.example.firstapplication

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signuppage)

        // Find views by their IDs
        val email: EditText = findViewById(R.id.editTextTextEmailAddress2)
        val password: EditText = findViewById(R.id.editTextTextPassword)
        val signupButton: Button = findViewById(R.id.button3)

        // Set click listener for the signup button
        signupButton.setOnClickListener {
            val emailText = email.text.toString().trim()
            val passwordText = password.text.toString().trim()

            // Perform email validation
            if (emailText.isBlank()) {
                email.error = "Email is required"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
                email.error = "Invalid email address"
            }
            // Perform password validation
            else if (passwordText.isBlank()) {
                password.error = "Password is required"
            } else if (passwordText.length < 6) {
                password.error = "Password must be at least 6 characters"
            }
            // Successful validation
            else {
                Toast.makeText(this, "Sign Up Successful!", Toast.LENGTH_SHORT).show()
                // Navigate to the next screen or perform further actions
            }
        }
    }
}
