package com.example.composenorway

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextStyleItem() {

    val fontFamily = FontFamily(
        Font(R.font.tilt_prism_regular, FontWeight.Normal)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(16.dp)
            .background(Color.Black),
    ) {
        Text(
            modifier = Modifier.fillMaxSize(),
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Cyan, fontSize = 40.sp)) {
                    append("J")
                }
                append("etpack ")
                withStyle(style = SpanStyle(color = Color.Cyan, fontSize = 40.sp)) {
                    append("C")
                }
                append("ompose")
            },
            color = Color.White,
            fontSize = 36.sp,
            fontFamily = fontFamily,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
    }

}