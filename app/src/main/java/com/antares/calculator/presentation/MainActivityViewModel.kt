package com.antares.calculator.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var result = MutableLiveData<Int>()

    private var count = 0

    init {
        result.value = count
    }

    fun incResult() {
        result.value = ++count
    }
}