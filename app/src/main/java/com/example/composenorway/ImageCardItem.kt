package com.example.composenorway

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImageCardItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .padding(16.dp)
    ) {
        val painter = painterResource(id = R.drawable.ic_warhammer)
        val contentDescription = "Warhammmer"
        val title = "Warhammer"
        ImageCard(painter, contentDescription, title)
    }
}

@Composable
private fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,
        backgroundColor = Color.Cyan
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart,
            ) {
                Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}