package com.example.composenorway

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.magnifier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

@Composable
fun StateItem() {
    val color = remember { mutableStateOf(Color.Yellow) }

    Column(modifier = Modifier.fillMaxSize()) {

        ColorBox(
            Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            color.value = it
        }

        Box(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(color.value)
        )
    }
}

@Composable
fun ColorBox(modifier: Modifier, updateColor: (Color) -> Unit) {
    Box(modifier = modifier
        .background(Color.Blue)
        .clickable {
            updateColor(Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f))
        })
}