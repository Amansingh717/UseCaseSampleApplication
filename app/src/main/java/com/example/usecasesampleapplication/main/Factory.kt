package com.example.usecasesampleapplication.main

import com.example.usecasesampleapplication.domain.LoginUserUseCaseImpl
import com.example.usecasesampleapplication.domain.LogoutUserUseCaseImpl
import com.example.usecasesampleapplication.repository.implementation.UserRepoImpl

object Factory {
    private val userRepo by lazy { UserRepoImpl() }
    val loginInUseCase by lazy { LoginUserUseCaseImpl(userRepo) }
    val logoutUseCase by lazy { LogoutUserUseCaseImpl(userRepo) }
}