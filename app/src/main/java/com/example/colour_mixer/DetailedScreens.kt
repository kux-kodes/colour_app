package com.example.colour_mixer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun Red_details(navController: NavHostController){
    Box(modifier = Modifier
        .width(200.dp)
        .height(200.dp)
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp))){
        Text(modifier = Modifier.padding(10.dp),
            text = "Passion and Love: Red is often associated with strong emotions, particularly love and passion. It is a color commonly used to represent romantic feelings.\n" +
                "Energy and Power: Red is dynamic and attention-grabbing, symbolizing energy, power, and vitality.\n" +
                "Danger and Warning: Red is frequently used in warning signs and signals due to its association with danger and urgency.")

    }
}
@Composable
fun Blue_details(navController:NavHostController){
    Box(modifier = Modifier
        .width(200.dp)
        .height(300.dp)
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp)),
        contentAlignment = Alignment.Center){
        Text(modifier = Modifier.padding(10.dp),
            text = "Calmness and Serenity: Blue is often associated with feelings of calmness, tranquility, and serenity. It is a color that can evoke a sense of peace and relaxation.\n" +
                    "Trust and Stability: Blue is commonly used to convey trustworthiness, stability, and reliability. Many corporate logos and uniforms incorporate shades of blue to inspire confidence.\n" +
                    "Royalty and Nobility: Historically, certain shades of blue were associated with royalty and nobility, as the pigments used to create them were rare and expensive.")

    }
}

