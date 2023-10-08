package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val emailCorrect="hamza";
        val passCorrect="123";


        binding.signInBtn.setOnClickListener {
            val email=binding.et1.text.toString();
            val password=binding.et2.text.toString();

            if ((email == emailCorrect) && (password == passCorrect)) {
                Toast.makeText(applicationContext, "Login Successful", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(
                    applicationContext,
                    "Login Failed",
                    Toast.LENGTH_SHORT
                ).show();
            }
        }
        binding.signuptv.setOnClickListener {
            val Intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}