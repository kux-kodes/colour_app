package com.example.colour_mixer

sealed class DefineScreens(val route: String){
    object HomeScreen: DefineScreens("home_screen")
    object RedDetails: DefineScreens("red_details")
    object BlueDetails: DefineScreens("blue_details")
}
