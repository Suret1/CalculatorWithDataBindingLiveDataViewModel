package com.suret.calculatordatabinding.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    var answer = MutableLiveData<Double>()

    init {
        answer.value = 0.0
    }

    fun plus(param: String, param2: String) {
        answer.value = (param.toDouble() + param2.toDouble())
    }

    fun minus(param: String, param2: String) {
        answer.value = (param.toDouble() - param2.toDouble())
    }

    fun divide(param: String, param2: String) {
        answer.value = (param.toDouble() / param2.toDouble())
    }

    fun multiply(param: String, param2: String) {
        answer.value = (param.toDouble() * param2.toDouble())
    }
}