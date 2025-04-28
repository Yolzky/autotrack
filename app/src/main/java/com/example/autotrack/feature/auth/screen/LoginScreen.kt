package com.example.autotrack.feature.auth.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.autotrack.feature.auth.components.EmailField
import com.example.autotrack.feature.auth.components.PasswordField
import com.example.autotrack.feature.auth.components.RememberMeSection
import com.example.autotrack.feature.auth.viewmodel.LoginViewModel

@Composable
fun LoginScreen(viewModel: LoginViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Log in",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "Please enter log in details below",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        EmailField(
            email = viewModel.email.value,
            onEmailChange = viewModel::onEmailChange
        )

        Spacer(modifier = Modifier.height(16.dp))

        PasswordField(
            password = viewModel.password.value,
            onPasswordChange = viewModel::onPasswordChange
        )

        RememberMeSection(
            rememberMe = viewModel.rememberMe.value,
            onRememberMeChange = viewModel::onRememberMeChange,
            onForgotPasswordClick = viewModel::forgotPassword
        )

        Button(
            onClick = viewModel::login,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Log in")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text("Or")

        Spacer(modifier = Modifier.height(24.dp))


        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Don't have an account?")
            TextButton(onClick = viewModel::navigateToSignUp) {
                Text("Sign Up")
            }
        }
    }
}