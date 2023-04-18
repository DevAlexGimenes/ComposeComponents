package com.alex.gimenes.apps.composecomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.alex.gimenes.apps.composecomponents.navigation.Navigation
import com.alex.gimenes.apps.composecomponents.ui.theme.ComposeComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeComponentsTheme {
                Navigation()
            }
        }
    }
}