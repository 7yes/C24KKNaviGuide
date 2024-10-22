package com.jesse.c24kknaviguide.core.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen(){
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Detail Screen", fontSize = 30.sp)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {  }) {
            Text(text = "Go to Home")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}