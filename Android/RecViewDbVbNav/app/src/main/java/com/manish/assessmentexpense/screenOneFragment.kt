package com.manish.assessmentexpense

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.manish.assessmentexpense.databinding.FragmentScreenOneBinding

class screenOneFragment : Fragment() {
    private val viewModel: ExpViewmodel by activityViewModels()
    private lateinit var  binding: FragmentScreenOneBinding



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate<FragmentScreenOneBinding>(
            inflater,
            R.layout.fragment_screen_one,
            container,
            false
        )
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ExpAdapter(
            requireContext(),
            viewModel.getExpenses()
        )
        binding.recDsh.adapter = adapter

        val layoutManager = LinearLayoutManager(requireContext())
        binding.recDsh.layoutManager = layoutManager
        binding.recDsh.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                layoutManager.orientation
            )
        )



    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
