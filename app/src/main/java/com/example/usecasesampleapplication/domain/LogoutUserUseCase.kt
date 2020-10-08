package com.example.usecasesampleapplication.domain

import com.example.usecasesampleapplication.repository.UserRepo
import com.example.usecasesampleapplication.repository.implementation.UserRepoImpl

interface LogoutUserUseCase {
    operator fun invoke(userName: String?): String
}

class LogoutUserUseCaseImpl : LogoutUserUseCase {
    private val userRepo: UserRepo by lazy { UserRepoImpl() }
    override fun invoke(userName: String?): String {
        val result = if (userName == null) null
        else userRepo.signOut()

        return when (result) {
            null -> "Failure"
            else -> result
        }
    }
}