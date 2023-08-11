package com.foundations.dft_signup.opening_screen

import android.graphics.drawable.Icon
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.foundations.dft_signup.R
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import com.cursedfood.jetbizcard.ui.theme.coffeeBean90

@Composable
fun OpeningScreen() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(coffeeBean90) // Change color if needed
        ) {
        ImageComponent()
        }
    }
}

@Composable
fun ImageComponent() {
    // Replace with your desired background image
    Image(
        painterResource(R.drawable.background_image),
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
    )
    LogoComponent()
    SignInButton()
    SignUpButton()
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun LogoComponent() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(R.drawable.logo), // Replace with your logo resource
            contentDescription = null // Provide a suitable content description
        )
    }
}

@Composable
fun SignInButton() {
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

@Composable
fun SignUpButton() {
    Button(
        onClick = { /* Handle sign up button click */ },
        modifier = Modifier
            .fillMaxWidth()
            // Add necessary styling for Material3 Button
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.surface)
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black // Change text color if needed
        )
    ) {
        Text("Sign Up")
    }
}
