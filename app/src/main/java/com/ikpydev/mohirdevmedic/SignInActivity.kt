package com.ikpydev.mohirdevmedic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikpydev.mohirdevmedic.databinding.ActivitySignInBinding
import com.ikpydev.mohirdevmedic.databinding.ActivitySignUpBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sign.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)


        }
    }
}