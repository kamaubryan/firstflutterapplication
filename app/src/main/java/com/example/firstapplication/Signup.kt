package com.example.firstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.signuppage)
        val username: EditText = findViewById(R.id.editTextText)
        val email: EditText = findViewById(R.id.editTextTextEmailAddress)
        val password: EditText = findViewById(R.id.editTextTextPassword2)
        val signupButton: Button = findViewById(R.id.button3)

    }
}
//package com.example.userprofileapp
//
//import android.content.Intent
//import android.os.Bundle
//import android.util.Patterns
//import android.widget.Button
//import android.widget.EditText
//import androidx.appcompat.app.AppCompatActivity
//
//class SignUpActivity : AppCompatActivity(){
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_signup)
//        val username: EditText = findViewById(R.id.editTextText)
//        val email: EditText = findViewById(R.id.editTextTextEmailAddress)
//        val password: EditText = findViewById(R.id.editTextTextPassword2)
//        val signupButton: Button = findViewById(R.id.button3)
//
//        signupButton.setOnClickListener{
//            val nameText = username.text.toString().trim()
//            val emailText = email.text.toString().trim()
//            val passwordText = password.text.toString().trim()
//
//            if (nameText.isBlank()){
//                username.error  = "Username is required"
//            }else if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()){
//                email.error = "Invalid email address"
//            }else if (passwordText.isBlank()) {
//                password.error = "Password is required"
//            }}
//    }
//}//}