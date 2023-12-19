package com.example.navigationcompose.screen.third

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigationcompose.screen.first.FirstScreen
import com.example.navigationcompose.screen.second.navigateToSecond

/**
 * 2023-12-19
 * pureum
 */
fun NavController.navigateToThird(name: String){
    Log.e("TAG", "navigateToThird: $name", )
    this.navigate(name)
}

fun NavGraphBuilder.thirdScreen(onClick: () -> Unit){
    composable(route = "third"){
        ThirdScreen(onClick = {onClick()})
    }
}