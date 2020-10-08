package com.example.usecasesampleapplication.main.vm

import com.example.usecasesampleapplication.ParentViewModel
import com.example.usecasesampleapplication.domain.LoginUserUseCase
import com.example.usecasesampleapplication.domain.LogoutUserUseCase
import com.example.usecasesampleapplication.main.Factory

class SignInViewModel(
    private val loginUseCase: LoginUserUseCase = Factory.loginInUseCase,
    private val logoutUseCase: LogoutUserUseCase = Factory.logoutUseCase
) : ParentViewModel() {

    fun signInUser(userName: String?, password: String?): String {
        return loginUseCase(userName, password)
    }

    fun signOutUser(userName: String?): String {
        return logoutUseCase(userName)
    }
}