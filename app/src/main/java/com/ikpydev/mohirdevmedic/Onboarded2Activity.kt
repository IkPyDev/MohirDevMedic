package com.ikpydev.mohirdevmedic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikpydev.mohirdevmedic.databinding.ActivityOnboarded1Binding
import com.ikpydev.mohirdevmedic.databinding.ActivityOnboarded2Binding

class Onboarded2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboarded2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboarded2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.next.setOnClickListener {

            val intent = Intent(this, Onboarded3Activity::class.java)
            startActivity(intent)

        }
    }
}