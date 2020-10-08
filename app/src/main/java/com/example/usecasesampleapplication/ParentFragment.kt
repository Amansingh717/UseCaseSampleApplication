package com.example.usecasesampleapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider

open class ParentFragment<VM : ParentViewModel> : Fragment() {
    private lateinit var mViewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun getViewModel(): VM {
        return mViewModel
    }

    /**
     * This method sets up view model for the fragment
     */
    fun setupViewModel(viewModel: Class<VM>) {
        mViewModel = ViewModelProvider(this).get(viewModel)
    }

    fun setupViewModel(fragment: Fragment?, viewModel: Class<VM>) {
        mViewModel = if (fragment != null)
            ViewModelProvider(fragment).get(viewModel)
        else
            ViewModelProvider(this).get(viewModel)
    }

    protected fun setupViewModel(activity: FragmentActivity?, viewModel: Class<VM>) {
        mViewModel = if (activity != null)
            ViewModelProvider(activity).get(viewModel)
        else
            ViewModelProvider(this).get(viewModel)
    }
}