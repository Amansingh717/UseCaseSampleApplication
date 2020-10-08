package com.example.usecasesampleapplication.domain

import com.example.usecasesampleapplication.repository.UserRepo

interface LogoutUserUseCase {
    operator fun invoke(userName: String?): String
}

class LogoutUserUseCaseImpl(
    private val userRepo: UserRepo
) : LogoutUserUseCase {
    override fun invoke(userName: String?): String {
        val result = if (userName == null) null
        else userRepo.signOut()

        return when (result) {
            null -> "Failure"
            else -> result
        }
    }
}