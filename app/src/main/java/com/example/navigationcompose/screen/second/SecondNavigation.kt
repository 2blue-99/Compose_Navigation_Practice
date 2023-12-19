package com.example.navigationcompose.screen.second

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigationcompose.screen.first.FirstScreen
import com.example.navigationcompose.screen.first.navigateToFirst

/**
 * 2023-12-19
 * pureum
 */
fun NavController.navigateToSecond(name: String){
    Log.e("TAG", "navigateToSecond: $name", )
    this.navigate(name)
}

fun NavGraphBuilder.secondScreen(onClick:()-> Unit){
    composable(route = "second"){
        SecondScreen(onClick= onClick)
    }
}