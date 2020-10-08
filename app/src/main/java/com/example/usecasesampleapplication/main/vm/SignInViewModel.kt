package com.example.usecasesampleapplication.main.vm

import com.example.usecasesampleapplication.ParentViewModel
import com.example.usecasesampleapplication.domain.LoginUserUseCase
import com.example.usecasesampleapplication.domain.LoginUserUseCaseImpl
import com.example.usecasesampleapplication.domain.LogoutUserUseCase
import com.example.usecasesampleapplication.domain.LogoutUserUseCaseImpl

class SignInViewModel : ParentViewModel() {
    private val loginUseCase: LoginUserUseCase by lazy { LoginUserUseCaseImpl() }
    private val logoutUseCase: LogoutUserUseCase by lazy { LogoutUserUseCaseImpl() }

    fun signInUser(userName: String?, password: String?): String {
        return loginUseCase(userName, password)
    }

    fun signOutUser(userName: String?): String {
        return logoutUseCase(userName)
    }
}