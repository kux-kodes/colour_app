package com.example.colour_mixer

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun Red_details(navController: NavHostController){
    Box(modifier = Modifier
        .width(400.dp)
        .height(400.dp)
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp))
        .verticalScroll(rememberScrollState())){
        Text(modifier = Modifier.padding(10.dp),
            text = "Passion and Love: Red is often associated with strong emotions, particularly love and passion. It is a color commonly used to represent romantic feelings.\n" +
                "Energy and Power: Red is dynamic and attention-grabbing, symbolizing energy, power, and vitality.\n" +
                "Danger and Warning: Red is frequently used in warning signs and signals due to its association with danger and urgency.")

    }
}
@Composable
fun Blue_details(navController:NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp))
        .verticalScroll(rememberScrollState())
        .border(10.dp, Color.Blue, shape = RoundedCornerShape(10.dp)),
        verticalArrangement = Arrangement.Top){
        Text(modifier= Modifier
            .offset(10.dp,10.dp),
            textAlign= TextAlign.Center,
            fontWeight = FontWeight.Bold ,
            text = "Description:"+"\n")
        Text(modifier = Modifier.padding(10.dp),
            text = "Calmness and Serenity: Blue is often associated with feelings of calmness, tranquility, and serenity. It is a color that can evoke a sense of peace and relaxation.\n" +"\n"+
                    "Trust and Stability: Blue is commonly used to convey trustworthiness, stability, and reliability. Many corporate logos and uniforms incorporate shades of blue to inspire confidence.\n" + "\n"+
                    "Royalty and Nobility: Historically, certain shades of blue were associated with royalty and nobility, as the pigments used to create them were rare and expensive.")
        Text(modifier= Modifier.offset(10.dp, 10.dp),
            textAlign= TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text= "Best Paired With:"+"\n")
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(20.dp,10.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(255,140,0))
            .clickable())
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(80.dp,(-30).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(255,0,0)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(140.dp,(-70).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(0,255,0)))
            }
    }

@Preview(showBackground = true)
@Composable 
fun ShowDetails(){
    Blue_details(navController = rememberNavController())
}