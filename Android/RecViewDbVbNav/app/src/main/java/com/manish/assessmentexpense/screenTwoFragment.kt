package com.manish.assessmentexpense

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.manish.assessmentexpense.databinding.FragmentScreenTwoBinding


class screenTwoFragment : Fragment() {
    private lateinit var binding : FragmentScreenTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScreenTwoBinding.inflate(inflater,container,false)
        return binding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.button.setOnClickListener {
//            val nm = binding.editTextTextPersonName.text.toString()
//            val ab = binding.editTextTextPersonName2.text.toString()
//            val date = binding.textView4.text.toString()
//            val action = screenTwoFragmentDirections.actionScreenTwoFragmentToScreenOneFragment(nm,ab,date)
//            findNavController().navigate(action)
//
//
//
//
//        }
//    }
}