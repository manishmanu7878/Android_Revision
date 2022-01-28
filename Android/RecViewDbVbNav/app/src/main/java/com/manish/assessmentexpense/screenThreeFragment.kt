package com.manish.assessmentexpense

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.manish.assessmentexpense.databinding.FragmentScreenThreeBinding
import com.manish.assessmentexpense.databinding.FragmentScreenTwoBinding


class screenThreeFragment : Fragment() {
    private lateinit var binding : FragmentScreenThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScreenThreeBinding.inflate(inflater,container,false)
        return binding.root
    }
}