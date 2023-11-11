package com.gkaan.kgsyksdestek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.gkaan.kgsyksdestek.databinding.ActivityMainHomeBinding
import com.gkaan.kgsyksdestek.home.*

class MainHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(MainFragment())

        binding.bottomNavigationView2.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> replaceFragment(MainFragment())
                R.id.nav_profile -> replaceFragment(ProfilFragment())
                R.id.nav_chart -> replaceFragment(ChartFragment())
                R.id.nav_add -> replaceFragment(AddQuestionFragment())
                R.id.nav_favourite -> replaceFragment(FavouriteFragment())

                else ->{

                }

            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}