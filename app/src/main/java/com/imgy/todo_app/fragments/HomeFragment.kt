package com.imgy.todo_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar
import com.imgy.todo_app.R
import com.imgy.todo_app.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var toolbar: MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        toolbar = binding.toolbar.materialToolbar
        toolbar.title = "Hi Ibrahim"
        toolbar.subtitle = "Welcome to your bucket list!"
        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_profile -> {
                    Toast.makeText(context, "profile clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }

        }
        return binding.root
    }

}