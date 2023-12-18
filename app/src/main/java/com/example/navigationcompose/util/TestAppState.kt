package com.example.navigationcompose.util

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.screen.first.navigateToFirst
import com.example.navigationcompose.screen.second.navigateToSecond
import com.example.navigationcompose.screen.third.navigateToThird

/**
 * 2023-12-19
 * pureum
 */
@Composable
fun rememberTestAppState(
    navController: NavHostController = rememberNavController()
): TestAppState {
    return remember(
        navController
    ){
        TestAppState(
            navController
        )
    }
}

@Stable
class TestAppState(
    val navController: NavHostController
){
    fun navigateToTopLevelDestination(name: String) {
        when(name){
            "first" -> navController.navigateToFirst("first")
            "second" -> navController.navigateToSecond("second")
            "third" -> navController.navigateToThird("third")
        }
    }
}