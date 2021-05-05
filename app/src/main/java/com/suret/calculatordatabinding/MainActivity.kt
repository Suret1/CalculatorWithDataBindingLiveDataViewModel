package com.suret.calculatordatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.suret.calculatordatabinding.databinding.ActivityMainBinding
import com.suret.calculatordatabinding.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    lateinit var viewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        dataBinding.lifecycleOwner = this
        dataBinding.viewModel = viewModel


    }

}