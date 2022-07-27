package com.imgy.todo_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.imgy.todo_app.databinding.ActivityMainBinding
import com.imgy.todo_app.databinding.ActivityMainBinding.inflate
import com.imgy.todo_app.databinding.FragmentHomeBinding.inflate
import com.imgy.todo_app.databinding.FragmentIntroBinding.inflate
import com.imgy.todo_app.fragments.HomeFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}