package com.example.colour_mixer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.colour_mixer.ui.theme.Colour_mixerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Colour_mixerTheme {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}


@Composable
fun Overall_Screen(navController: NavHostController) {
    Box(modifier = Modifier) {
        Surface(
            modifier = Modifier
                .width(500.dp)
                .height(800.dp),
            color = Color(255, 228, 225)
        ) {
            Instruction_1()
            Color_grid(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Instruction_1() {
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "Please Choose A Colour",
            modifier = Modifier
                .padding(20.dp)
                .clip(RoundedCornerShape(10.dp)),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Color_grid(navController: NavHostController) {
    var boxBackground: Color = Color.Red
    Box(modifier = Modifier, contentAlignment = Alignment.CenterEnd) {
        LazyVerticalGrid(columns = GridCells.Fixed(3)) {
            items(9) { j ->
                Box(
                    modifier = Modifier
                        .aspectRatio(1f)
                        .padding(10.dp)
                        .background(boxBackground)
                        .clip(RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    when (j) {
                        0 -> {
                            Text(text = "Red",
                                modifier = Modifier.clickable { navController.navigate("red_details") }); boxBackground =
                                Color.Blue
                        }

                        1 -> {
                            Text(text = "Blue",
                                modifier = Modifier.clickable { navController.navigate("blue_details") }); boxBackground =
                                Color.Green
                        }

                        2 -> {
                            Text(text = "Green",
                                modifier = Modifier.clickable { navController.navigate("green_details") });boxBackground =
                                Color.Yellow
                        }

                        3 -> {
                            Text(text = "Yellow",
                                modifier = Modifier.clickable { navController.navigate("yellow_details") }); boxBackground =
                                Color.Gray
                        }

                        4 -> {
                            Text(text = "Grey",
                                modifier = Modifier.clickable { navController.navigate("grey_details") });boxBackground =
                                Color.Magenta
                        }

                        5 -> {
                            Text(text = "Magenta",
                                modifier = Modifier.clickable { navController.navigate("magenta_details") }); boxBackground =
                                Color.White
                        }

                        6 -> {
                            Text(text = "White",
                                modifier = Modifier.clickable { navController.navigate("white_details") }); boxBackground =
                                Color(255, 192, 203)
                        }

                        7 -> {
                            Text(text = "Pink",
                                modifier = Modifier.clickable { navController.navigate("pink_details") }); boxBackground =
                                Color(0, 0, 0)
                        }

                        8 -> {
                            Text(
                                text = "Black",
                                modifier = Modifier.clickable { navController.navigate("black_details") },
                                color = Color(255, 255, 255)
                            )
                        }
                    }
                }
            }
        }
    }
}
