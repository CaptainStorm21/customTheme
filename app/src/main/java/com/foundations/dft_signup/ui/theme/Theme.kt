package com.foundations.dft_signup.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.cursedfood.jetbizcard.ui.theme.Gold10
import com.cursedfood.jetbizcard.ui.theme.Gold20
import com.cursedfood.jetbizcard.ui.theme.Linen20
import com.cursedfood.jetbizcard.ui.theme.Linen40
import com.cursedfood.jetbizcard.ui.theme.Milk30
import com.cursedfood.jetbizcard.ui.theme.coffeeBean20
import com.cursedfood.jetbizcard.ui.theme.coffeeBean40
import com.cursedfood.jetbizcard.ui.theme.coffeeBean70
import com.cursedfood.jetbizcard.ui.theme.coffeeBean90
import com.cursedfood.jetbizcard.ui.theme.redFlame
import com.cursedfood.jetbizcard.ui.theme.redTree70


private val DarkColorScheme = darkColorScheme(
    primary = coffeeBean90,
    secondary = redTree70,
    tertiary =  coffeeBean20,
    surface = coffeeBean70,
    background = coffeeBean90,
    error = redFlame,
    onError = Linen20,
    onErrorContainer = Linen20,
    errorContainer = Linen20,
    outline = Gold10,
)

private val LightColorScheme = lightColorScheme(
    primary = Linen40,
    secondary = Gold20,
    tertiary = Milk30,
    surface = Linen40,
    background = Linen20,
    outline = Gold10,
    error = redFlame,
    onError = Linen20,
    onErrorContainer = Linen20,
    errorContainer = Linen20,



    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun DftsignupTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}