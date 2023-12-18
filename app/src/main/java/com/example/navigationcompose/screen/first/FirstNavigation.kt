package com.example.navigationcompose.screen.first

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

/**
 * 2023-12-19
 * pureum
 */
fun NavController.navigateToFirst(name: String){
    Log.e("TAG", "navigateToFirst: $name", )
    this.navigate(name)
}

fun NavGraphBuilder.firstScreen(){
    composable(route = "first"){
        FirstScreen()
    }
}
