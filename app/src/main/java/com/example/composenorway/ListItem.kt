package com.example.composenorway

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composenorway.data.TestData

@Composable
fun ListItem() {

    val list = mutableListOf<TestData>()
    list.add(TestData("click", "Denys"))
    list.add(TestData("show", "Anna"))
    list.add(TestData("click", "Ira"))
    list.add(TestData("show", "Oleg"))
    list.add(TestData("click", "Denys"))
    list.add(TestData("show", "Anna"))
    list.add(TestData("click", "Ira"))
    list.add(TestData("show", "Oleg"))
    list.add(TestData("click", "Denys"))
    list.add(TestData("show", "Anna"))
    list.add(TestData("click", "Ira"))
    list.add(TestData("show", "Oleg"))
    list.add(TestData("click", "Denys"))
    list.add(TestData("show", "Anna"))
    list.add(TestData("click", "Ira"))
    list.add(TestData("show", "Oleg"))

    LazyColumn() {
        items(list) { item ->
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
                textAlign = TextAlign.Center,
                text = item.name
            )
        }
    }
}