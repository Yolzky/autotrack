package com.example.autotrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.autotrack.feature.auth.screen.LoginScreen
import com.example.autotrack.feature.auth.viewmodel.LoginViewModel
import com.example.autotrack.ui.theme.AutoTrackTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AutoTrackTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val loginViewModel: LoginViewModel = viewModel()
                    LoginScreen(viewModel = loginViewModel)
                }
            }
        }
    }
}
