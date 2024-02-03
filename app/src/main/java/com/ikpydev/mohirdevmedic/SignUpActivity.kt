package com.ikpydev.mohirdevmedic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ikpydev.mohirdevmedic.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sign.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)


        }
    }
}