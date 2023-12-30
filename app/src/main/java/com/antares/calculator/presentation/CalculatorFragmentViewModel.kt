package com.antares.calculator.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorFragmentViewModel : ViewModel() {

    private val _operandOne = MutableLiveData<String>("")
    val operandOne: LiveData<String>
        get() = _operandOne

    private var textDisplay = ""

    init {
        _operandOne.value = textDisplay
    }

    fun textOutput(number: Int) {
        textDisplay += number
        _operandOne.value = textDisplay
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
    }
}