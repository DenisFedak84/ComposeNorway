package com.example.composenorway

import android.widget.EditText
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun EditTextItem() {

    val scaffoldState = rememberScaffoldState()
    var textFieldState by remember {
        mutableStateOf("")
    }
    var scope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            TextField(
                value = textFieldState,
                label = { Text(text = "Enter your name") },
                onValueChange = {
                    textFieldState = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                scope.launch {
                    scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldState")
                }
            }) {
                Text(text = "Click me")
            }
        }
    }
}