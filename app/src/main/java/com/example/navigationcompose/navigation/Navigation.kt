package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.screen.first.FirstScreen
import com.example.navigationcompose.screen.first.firstScreen
import com.example.navigationcompose.screen.second.SecondScreen
import com.example.navigationcompose.screen.second.secondScreen
import com.example.navigationcompose.screen.third.ThirdScreen
import com.example.navigationcompose.screen.third.thirdScreen
import com.example.navigationcompose.util.TestAppState

/**
 * 2023-12-18
 * pureum
 */

@Composable
fun MyNavHost(
    modifier : Modifier,
    appState: TestAppState,
){
    val navController = appState.navController

    NavHost(
        navController = navController,
        startDestination = "first",
        modifier = modifier
    ){
        firstScreen()
        secondScreen()
        thirdScreen()
    }
}

//@Composable
//fun ToFirst(
//    navHostController: NavHostController
//){
//    navHostController.navigate("first")
//}
//
//@Composable
//fun ToSecond(
//    navHostController: NavHostController
//){
//    navHostController.navigate("second")
//}
//
//@Composable
//fun ToThird(
//    navHostController: NavHostController
//){
//    navHostController.navigate("third")
//}