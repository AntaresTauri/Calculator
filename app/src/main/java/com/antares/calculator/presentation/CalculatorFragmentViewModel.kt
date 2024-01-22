package com.antares.calculator.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorFragmentViewModel : ViewModel() {

    private val _displayText = MutableLiveData<String>("")
    val displayText: LiveData<String>
        get() = _displayText

    private var operandOne = ""
    private var operandTwo = ""
    private var result = ""

    init {
        _displayText.value = operandOne
    }

    fun textOutput(number: Int) {
        operandOne += number
        _displayText.value = operandOne
    }

    fun textOutput(symbol: String) {
        operandOne += symbol
        _displayText.value = operandOne
    }

    fun saveOperandOne(operandOneInput: Int) {
        operandOne = operandOneInput.toString()
    }

    fun saveOperandTwo(operandTwoInput: Int) {
        operandTwo = operandTwoInput.toString()
    }

    fun clear() {
        operandOne = ""
        _displayText.value = operandOne
    }

    companion object {

        const val ZERO = 0
        const val ONE = 1
        const val TWO = 2
        const val THREE = 3
        const val FOUR = 4
        const val FIVE = 5
        const val SIX = 6
        const val SEVEN = 7
        const val EIGHT = 8
        const val NINE = 9

        const val PLUS = "+"
    }
}