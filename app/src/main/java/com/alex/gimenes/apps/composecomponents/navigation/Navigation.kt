package com.alex.gimenes.apps.composecomponents

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Navigation() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {
        NavHost(
            navController = navController,
            startDestination = Route.SPLASH_SCREEN
        ) {
            composable(route = Route.SPLASH_SCREEN) {
                AnimatedSplashScreen(
                    onSplashFinish = {
                        navController.popBackStack()
                        navController.navigate(Route.XXXXXXXX)
                    }
                )
            }
            composable(route = Route.XXXXXXXX) {
                Xxxxxx()
            }
        }
    }
}