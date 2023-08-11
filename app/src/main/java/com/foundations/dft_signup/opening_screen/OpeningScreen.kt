package com.foundations.dft_signup.opening_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.foundations.dft_signup.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.layout.ContentScale

@Composable
fun OpeningScreen() {
    Box {
        Image(
            painterResource(R.drawable.background_image),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LogoComponent()
            SignInButton()
            SignUpButton()
        }
    }
}


@Composable
fun LogoComponent() {
    Icon(
        painter = painterResource(R.drawable.logo), // Replace with your logo resource
        contentDescription = null // Provide a suitable content description
    )
}

@Composable
fun SignInButton() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { /* Handle sign in button click */ },
            modifier = Modifier
                .fillMaxWidth()
                // Add necessary styling for Material3 Button
                .padding(16.dp)
                .background(MaterialTheme.colorScheme.primary)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White // Change text color if needed
            )
        ) {
            Text("Sign In")
        }
    }
}

@Composable
fun SignUpButton() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { /* Handle sign in button click */ },
            modifier = Modifier
                .fillMaxWidth()
                // Add necessary styling for Material3 Button
                .padding(16.dp)
                .background(MaterialTheme.colorScheme.primary)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White // Change text color if needed
            )
        ) {
            Text("Sign Up")
        }
    }
}

