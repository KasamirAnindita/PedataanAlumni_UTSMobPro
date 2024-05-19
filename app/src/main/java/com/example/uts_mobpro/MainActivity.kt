package com.example.uts_mobpro

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.editEmail)
        val password = findViewById<EditText>(R.id.editPassword)
        val Login = findViewById<Button>(R.id.btn_login)

        val splashLogo = findViewById<Button>(R.id.btn)
        splashLogo.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // Set up the login button click listener
        Login.setOnClickListener {
            // Get the email and password from the text fields
            val emailText = email.text.toString()
            val passwordText = password.text.toString()

            // Check if the email and password are correct
            if (emailText == "admin@admin.com" && passwordText == "admin") {
                // Start the next activity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                // Show an error message
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }

    }
}