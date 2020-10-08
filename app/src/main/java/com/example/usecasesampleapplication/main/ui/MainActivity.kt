package com.example.usecasesampleapplication.main.ui

import android.os.Bundle
import com.example.usecasesampleapplication.ParentActivity
import com.example.usecasesampleapplication.R
import com.example.usecasesampleapplication.main.vm.MainActivityViewModel

class MainActivity : ParentActivity<MainActivityViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupActivityViewModel(MainActivityViewModel::class.java)
    }
}