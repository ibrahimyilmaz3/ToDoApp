package com.imgy.todo_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.navigateUp
import com.imgy.todo_app.R
import com.imgy.todo_app.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {
    private lateinit var binding: FragmentIntroBinding

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIntroBinding.inflate(inflater, container, false)
        binding.btnGetStarted.setOnClickListener(
            View.OnClickListener { Navigation.findNavController(binding.root)
                .navigate(R.id.action_introFragment_to_homeFragment) }
        )
        return binding.root
    }

}