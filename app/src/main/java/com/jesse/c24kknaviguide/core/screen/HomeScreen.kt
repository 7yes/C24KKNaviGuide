package com.jesse.c24kknaviguide.core.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(navToDetail : (String) -> Unit){
    var data = rememberSaveable(){ mutableStateOf("") }
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Home Screen", fontSize = 30.sp)
        Spacer(modifier = Modifier.weight(1f))
        TextField(value = data.value, onValueChange = {data.value = it})
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navToDetail(data.value) }) {
            Text(text = "Go to Detail")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}