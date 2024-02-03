package com.ikpydev.mohirdevmedic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ikpydev.mohirdevmedic.databinding.ActivityOnboarded1Binding

class Onboarded1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboarded1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboarded1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.next.setOnClickListener {

            val intent = Intent(this, Onboarded2Activity::class.java)
            startActivity(intent)

        }
    }
}