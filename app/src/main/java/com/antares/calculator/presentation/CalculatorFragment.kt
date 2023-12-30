package com.antares.calculator.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.antares.calculator.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment() {

    private var _binding: FragmentCalculatorBinding? = null
    private val binding: FragmentCalculatorBinding
        get() = _binding ?: throw RuntimeException("FragmentMainBinding == null")

    private val calculatorFragmentViewModel by lazy {
        ViewModelProvider(this).get(CalculatorFragmentViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCalculatorBinding.inflate(inflater, container, false)

        calculatorFragmentViewModel.operandOne.observe(viewLifecycleOwner, Observer {
            binding.textView.text = it.toString()
        })

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            buttonOne.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.ONE)
            }
            buttonTwo.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.TWO)
            }
            buttonThree.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.THREE)
            }
            buttonFour.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.FOUR)
            }
            buttonFive.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.FIVE)
            }
            buttonSix.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.SIX)
            }
            buttonSeven.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.SEVEN)
            }
            buttonEight.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.EIGHT)
            }
            buttonNine.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.NINE)
            }
            buttonZero.setOnClickListener {
                calculatorFragmentViewModel.textOutput(CalculatorFragmentViewModel.ZERO)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}