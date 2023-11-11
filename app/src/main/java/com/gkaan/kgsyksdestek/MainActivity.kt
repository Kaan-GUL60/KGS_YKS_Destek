package com.gkaan.kgsyksdestek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.gkaan.kgsyksdestek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 1500
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Handler().postDelayed({
            val intent = Intent(this, GuideActivity::class.java)
            startActivity(intent)
        }, SPLASH_DELAY)
    }
}