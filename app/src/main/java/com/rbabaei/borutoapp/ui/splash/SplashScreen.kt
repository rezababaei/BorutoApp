package com.rbabaei.borutoapp.ui.splash

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.Animatable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.draw.rotate
import com.rbabaei.borutoapp.R

@Composable
fun SplashScreen(navController: NavHostController) {
    val rotate = remember { Animatable(0f) }
    LaunchedEffect(key1 = true) {
        rotate.animateTo(targetValue = 360f,
            animationSpec = tween(durationMillis = 1000, delayMillis = 200))
    }

    Splash(rotate.value)
}

@Composable
fun Splash(rotationDegree: Float) {
    Box(modifier = Modifier
        .background(Brush.verticalGradient(listOf(MaterialTheme.colorScheme.primary,
            MaterialTheme.colorScheme.tertiary)))
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(modifier = Modifier.rotate(rotationDegree),
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = stringResource(
                R.string.app_logo))
    }

}

@Preview
@Composable
fun SplashScreenView() {
    Splash(rotationDegree = 0f)
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun SplashScreenDarkView() {
    Splash(rotationDegree = 0f)
}