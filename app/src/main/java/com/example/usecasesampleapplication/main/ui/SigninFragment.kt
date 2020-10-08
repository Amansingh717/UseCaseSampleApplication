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
import kotlinx.android.synthetic.main.fragment_signin.*

class SigninFragment : ParentFragment<SignInViewModel>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel(requireActivity(), SignInViewModel::class.java)

        button_sign_in.setOnClickListener {
            val result = getViewModel().signInUser(
                userName = username.text.toString(),
                password = password.text.toString()
            )
            Toast.makeText(requireContext(), result, Toast.LENGTH_SHORT).show()
            if (result == "LoginSuccessful") {
                navigateTo(
                    R.id.action_signinFragment_to_homeFragment, Bundle().apply {
                        putString(
                            ARG_USER_NAME, username.text.toString()
                        )
                    }
                )
            }
        }
    }
}