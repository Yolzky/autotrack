package com.example.autotrack.feature.auth.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val email = mutableStateOf("")
    val password = mutableStateOf("")
    val rememberMe = mutableStateOf(false)

    fun onEmailChange(newEmail: String) {
        email.value = newEmail
    }

    fun onPasswordChange(newPassword: String) {
        password.value = newPassword
    }

    fun onRememberMeChange(newValue: Boolean) {
        rememberMe.value = newValue
    }

    fun login() {
        // TODO: Implement login logic
    }

    fun forgotPassword() {
        // TODO: Implement forgot password logic
    }

    fun navigateToSignUp() {
        // TODO: Navigate to SignUp Screen
    }
}
