package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//import com.example.myapplication.R.id.btnRegister

private lateinit var Register : Button

class MainActivity : AppCompatActivity() {
//    lateinit var etUsername: etUsername: EditText
//    lateinit var etUsername: etUsername: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Register = findViewById(R.id.btnSignUp)
        Register.setOnClickListener{
            setContentView(R.layout.activity_register)


        }
    }
}