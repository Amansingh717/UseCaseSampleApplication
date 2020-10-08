package com.example.usecasesampleapplication.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.usecasesampleapplication.ParentFragment
import com.example.usecasesampleapplication.R
import com.example.usecasesampleapplication.main.vm.SignInViewModel
import com.example.usecasesampleapplication.navigateTo
import kotlinx.android.synthetic.main.fragment_home.*

const val ARG_USER_NAME = "userName"

class HomeFragment : ParentFragment<SignInViewModel>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel(requireActivity(), SignInViewModel::class.java)
        val userName = arguments?.getString(ARG_USER_NAME)
        username.text = userName

        button_sign_out.setOnClickListener {
            val result = getViewModel().signOutUser(
                userName = userName
            )
            Toast.makeText(requireContext(), result, Toast.LENGTH_SHORT).show()

            if (result == "LogoutSuccessful") {
                navigateTo(R.id.action_homeFragment_to_signinFragment)
            }
        }
    }
}