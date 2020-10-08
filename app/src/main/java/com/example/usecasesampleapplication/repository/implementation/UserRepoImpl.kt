package com.example.usecasesampleapplication.repository.implementation

import com.example.usecasesampleapplication.repository.UserRepo

class UserRepoImpl : UserRepo {
    override fun signIn(userName: String, password: String): String? {
        //perform login with API
        return "LoginSuccessful"
    }

    override fun signOut(): String? {
        return "LogoutSuccessful"
    }

}