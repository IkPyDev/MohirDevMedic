package com.ikpydev.mohirdevmedic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikpydev.mohirdevmedic.databinding.ActivityOnboarded2Binding
import com.ikpydev.mohirdevmedic.databinding.ActivityOnboarded3Binding

class Onboarded3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboarded3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboarded3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.next.setOnClickListener {

            val intent = Intent(this, SignActivity::class.java)
            startActivity(intent)

        }
    }
}