package com.ikpydev.mohirdevmedic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import com.ikpydev.mohirdevmedic.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding:ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val anim = AnimationUtils.loadAnimation(this,R.anim.anim_360)
        anim.repeatCount = 3
        anim.duration = 1000

        binding.loading.startAnimation(anim)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }, 4000L)
    }
}