package com.example.myapplication

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val welcomeText = findViewById<TextView>(R.id.textV)


        val fadeIn = ObjectAnimator.ofFloat(welcomeText, "alpha", 0f, 1f)
        fadeIn.duration =
            2000 // Set the duration of the animation in milliseconds (2 seconds in this example)

        fadeIn.start()


        //startActivity(Intent(this, RegisterActivity::class.java))

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()         }, 3000)


    }


}