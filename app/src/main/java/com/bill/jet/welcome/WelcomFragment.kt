package com.bill.jet.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bill.jet.databinding.FragmentWelcomBinding

class WelcomFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = FragmentWelcomBinding.inflate(inflater)
        binding.welcomModel = WelcomModel(binding.root)
        return binding.root
    }
}