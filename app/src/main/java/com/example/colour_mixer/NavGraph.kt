package com.example.colour_mixer

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navController:NavHostController){
    NavHost(navController = navController, startDestination = DefineScreens.HomeScreen.route){
        composable(route=DefineScreens.HomeScreen.route){
            Overall_Screen(navController = navController)
        }
            composable(route= DefineScreens.RedDetails.route){
                Red_details(navController = navController)
            }
        composable(route=DefineScreens.BlueDetails.route){
            Blue_details(navController = navController)
        }
    }
}