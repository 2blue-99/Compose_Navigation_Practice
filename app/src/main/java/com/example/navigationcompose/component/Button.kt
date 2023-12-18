package com.example.navigationcompose.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * 2023-12-18
 * pureum
 */
@Composable
fun MyButton(
    text: String,
    onClick: () -> Unit
){
    Button(
        onClick = { onClick() },
    ) {
        Text(text = text)
    }
}