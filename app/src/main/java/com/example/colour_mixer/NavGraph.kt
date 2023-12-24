package com.example.colour_mixer

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = DefineScreens.HomeScreen.route ){
        composable( route= DefineScreens.HomeScreen.route)
        { Overall_Screen{
           navHostController.navigate(DefineScreens.RedDetails.route) } }
        composable(route=DefineScreens.RedDetails.route){
            Red_details{
              navHostController.navigate(DefineScreens.BlueDetails.route)}
        }
    }
}