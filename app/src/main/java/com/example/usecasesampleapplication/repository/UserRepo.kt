package com.example.usecasesampleapplication.repository

interface UserRepo {
    fun signIn(userName: String, password: String): String?
    fun signOut(): String?
}