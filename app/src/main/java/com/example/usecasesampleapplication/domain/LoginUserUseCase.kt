package com.example.usecasesampleapplication.domain

import com.example.usecasesampleapplication.repository.UserRepo
import com.example.usecasesampleapplication.repository.implementation.UserRepoImpl

interface LoginUserUseCase {
    operator fun invoke(userName: String?, password: String?): String
}

class LoginUserUseCaseImpl : LoginUserUseCase {
    private val userRepo: UserRepo by lazy { UserRepoImpl() }

    override fun invoke(userName: String?, password: String?): String {
        val result = if (userName == null || password == null) null
        else userRepo.signIn(userName, password)

        return when (result) {
            null -> "Failure"
            else -> result
        }
    }
}