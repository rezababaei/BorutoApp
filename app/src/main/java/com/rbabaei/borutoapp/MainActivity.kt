package com.rbabaei.borutoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.rbabaei.borutoapp.navigation.SetupNavGraph
import com.rbabaei.borutoapp.ui.theme.BorutoAppTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController:NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BorutoAppTheme {
                navController= rememberNavController()
                SetupNavGraph(navController = navController)

            }
        }
    }
}

