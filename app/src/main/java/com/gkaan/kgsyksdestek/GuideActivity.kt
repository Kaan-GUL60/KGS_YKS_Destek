package com.gkaan.kgsyksdestek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gkaan.kgsyksdestek.databinding.ActivityGuideBinding

class GuideActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuideBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuideBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}