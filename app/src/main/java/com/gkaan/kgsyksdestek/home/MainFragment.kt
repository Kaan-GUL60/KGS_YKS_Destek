package com.gkaan.kgsyksdestek.home

import android.graphics.Color
import android.os.Build.VERSION_CODES.DONUT
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.db.williamchart.data.configuration.ChartConfiguration
import com.gkaan.kgsyksdestek.R
import com.gkaan.kgsyksdestek.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var chartConfiguration: ChartConfiguration
    private var _binding: FragmentMainBinding?=null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            donutChartView.donutColors= intArrayOf(
                Color.parseColor("#FFFFFF"),Color.parseColor("#9EFFFFFF"),Color.parseColor("8DFFFFFF")
            )
            donutChartView.animation.duration = animationDuration
            donutChartView.animate(donutSet)
        }
    }

    companion object{
        private val donutSet = listOf(
            20F,
            80F,
            100F
        )
        private const val animationDuration = 1000L
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =FragmentMainBinding.inflate(inflater,container,false)
        val view = binding.root

        return view

    }


}