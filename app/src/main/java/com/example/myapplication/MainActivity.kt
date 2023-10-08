package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.signUpBtn.setOnClickListener {
//            var userAge=binding.etage.text.toString();
//              var age=18;
//            if (userAge .equals(age)  ){
                val intent = Intent(this, SignIn::class.java)
                startActivity(intent);
                Toast.makeText(applicationContext,"Sign Up successful",Toast.LENGTH_SHORT).show();
//
//            } else {
//                Toast.makeText(applicationContext,"You are restricted",Toast.LENGTH_SHORT).show();
//            }
//
        }
    }
}







