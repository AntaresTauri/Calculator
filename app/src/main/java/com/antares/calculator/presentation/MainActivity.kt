package com.antares.calculator.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.antares.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainActivityViewModel by lazy {
        ViewModelProvider(this)[MainActivityViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            textView.text = mainActivityViewModel.result.value.toString()
            buttonFive.setOnClickListener {
                mainActivityViewModel.incResult()
            }
        }

        mainActivityViewModel.result.observe(this, Observer {
            binding.textView.text = it.toString()
        })
    }
}