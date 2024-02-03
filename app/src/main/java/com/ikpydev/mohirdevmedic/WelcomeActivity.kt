package com.ikpydev.mohirdevmedic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Onboarded1Activity::class.java)
            startActivity(intent)
        }, 4000L)
    }
}