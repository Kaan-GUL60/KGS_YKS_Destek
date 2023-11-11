package com.gkaan.kgsyksdestek.guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gkaan.kgsyksdestek.R
import com.gkaan.kgsyksdestek.databinding.FragmentGuide1Binding


class GuideFragment1 : Fragment() {
    private var _binding: FragmentGuide1Binding?=null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGuide1Binding.inflate(inflater,container,false)
        val view = binding.root

        binding.button.setOnClickListener {

        }






        return view
    }


}