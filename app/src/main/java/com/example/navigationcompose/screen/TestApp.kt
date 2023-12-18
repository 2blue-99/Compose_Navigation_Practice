package com.example.navigationcompose.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.navigationcompose.component.MyButton
import com.example.navigationcompose.navigation.MyNavHost
import com.example.navigationcompose.util.TestAppState
import com.example.navigationcompose.util.rememberTestAppState

/**
 * 2023-12-18
 * pureum
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestApp(
    appState: TestAppState = rememberTestAppState()
){

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            TestBottomBar(
                onNavigateToDestination = appState::navigateToTopLevelDestination,
            )
        }
    ) { padding ->
        MyNavHost(appState = appState, modifier = Modifier.padding(padding))
//        Row(modifier = Modifier.fillMaxSize().padding(padding)) {
//            MyButton(text = "hahaha", onClick = {})
//        }
    }
}

@Composable
fun TestBottomBar(
    onNavigateToDestination: (String) -> Unit,
){
    NavigationBar {
        MyNavigationBarItem(
            icon = Icons.Default.AccountBox,
            text = "First",
            onClick = {
                onNavigateToDestination("first")
            }
        )
        MyNavigationBarItem(
            icon = Icons.Default.AccountBox,
            text = "Second",
            onClick = {
                onNavigateToDestination("second")
            }
        )
        MyNavigationBarItem(
            icon = Icons.Default.AccountBox,
            text = "Third",
            onClick = {
                onNavigateToDestination("third")
            }
        )
    }
}

@Composable
fun RowScope.MyNavigationBarItem(
    icon: ImageVector,
    text: String,
    onClick: () -> Unit,
) {
    NavigationBarItem(
        onClick = {onClick()},
        icon = {
            Icon(
                imageVector = icon,
                contentDescription = null,
            )
        },
        label = {
            Text(text)
        },
        selected = true
    )
}
