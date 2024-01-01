package com.example.colour_mixer

sealed class DefineScreens(val route: String){
    object HomeScreen: DefineScreens("home_screen")
    object RedDetails: DefineScreens("red_details")
    object BlueDetails: DefineScreens("blue_details")
    object GreenDetails: DefineScreens("green_details")
    object YellowDetails: DefineScreens("yellow_details")
    object GreyDetails: DefineScreens("grey_details")
    object MagentaDetails: DefineScreens("magenta_details")
}
