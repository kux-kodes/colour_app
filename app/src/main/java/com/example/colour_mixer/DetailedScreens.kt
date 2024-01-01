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
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp))
        .verticalScroll(rememberScrollState())
        .border(10.dp, Color.Red, shape = RoundedCornerShape(10.dp))
        .background(Color(255, 228, 225)),
    verticalArrangement = Arrangement.Top){
        Text(modifier= Modifier
            .offset(10.dp,10.dp),
            textAlign= TextAlign.Center,
            fontWeight = FontWeight.Bold ,
            text = "Description:"+"\n")
        Text(modifier = Modifier.padding(10.dp),
            text = "Passion and Love: Red is often associated with strong emotions, particularly love and passion. It is a color commonly used to represent romantic feelings.\n" + "\n"+
                "Energy and Power: Red is dynamic and attention-grabbing, symbolizing energy, power, and vitality.\n" + "\n"+
                "Danger and Warning: Red is frequently used in warning signs and signals due to its association with danger and urgency.")
        Text(modifier= Modifier.offset(10.dp, 10.dp),
            textAlign= TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text= "Best Paired With:"+"\n")
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(20.dp, 10.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(0, 0, 0)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(80.dp, (-30).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(0, 0, 255)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(140.dp, (-70).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(255, 255, 255)))
    }
}
@Composable
fun Blue_details(navController:NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp))
        .verticalScroll(rememberScrollState())
        .border(10.dp, Color.Blue, shape = RoundedCornerShape(10.dp))
        .background(Color(255, 228, 225)),
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
            .offset(20.dp, 10.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(255, 140, 0)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(80.dp, (-30).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(255, 0, 0)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(140.dp, (-70).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(0, 255, 0)))
            }
    }
@Composable fun Green_details(navController:NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp))
        .verticalScroll(rememberScrollState())
        .border(10.dp, Color.Green, shape = RoundedCornerShape(10.dp))
        .background(Color(255, 228, 225)),
        verticalArrangement = Arrangement.Top) {
        Text(
            modifier = Modifier
                .offset(10.dp, 10.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text = "Description:" + "\n"
        )
        Text(modifier = Modifier.padding(10.dp),
            text = "Nature and Growth:\n" +
                    "Green is closely linked to nature, symbolizing growth, renewal, and vitality. It is the color of leaves, grass, and many plants. As such, green often represents the cyclical processes of life, including birth, growth, and rejuvenation.\n" + "\n"+
                    "Harmony and Balance:\n" +
                    "Green is considered a harmonious and balanced color. It is situated in the middle of the visible spectrum, making it restful for the eyes. As a result, green is often associated with a sense of equilibrium, calmness, and stability.\n" + "\n"+
                    "Health and Well-being:\n" +
                    "The color green is frequently connected to health and well-being. It is commonly used in the context of hospitals, wellness centers, and health-related products to evoke feelings of healing, freshness, and a connection to nature.\n" + "\n"+
                    "Symbol of Money and Prosperity:\n" +
                    "In many cultures, green is associated with wealth, prosperity, and financial success. This association may stem from the color of U.S. currency (such as dollar bills) and the historical use of green to represent stability in financial contexts.\n" + "\n"+
                    "Symbol of Fertility:\n" +
                    "Green is often linked to fertility and abundance. This connection comes from the color's association with lush vegetation and the ability of nature to flourish. In this context, green can symbolize fertility, productivity, and the cycles of life.\n" + "\n"+
                    "Environmental Awareness:\n" +
                    "In contemporary times, green has become a symbol of environmental awareness and sustainability. It is often associated with efforts to protect the environment, promote eco-friendly practices, and emphasize the importance of conservation.\n" + "\n"+
                    "Cultural and Symbolic Variations:\n" +
                    "Cultural and regional differences can influence the symbolism of green. For example, in some cultures, green may symbolize luck and good fortune, while in others, it might have different connotations.")
        Text(modifier= Modifier.offset(10.dp, 10.dp),
            textAlign= TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text= "Best Paired With:"+"\n")
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(20.dp, 10.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(0, 0, 128)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(80.dp, (-30).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(54, 69, 79)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(140.dp, (-70).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(152, 255, 152)))

    }
}
@Composable
fun Yellow_details(navController:NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp))
        .verticalScroll(rememberScrollState())
        .border(10.dp, Color.Yellow, shape = RoundedCornerShape(10.dp))
        .background(Color(255, 228, 225)),
        verticalArrangement = Arrangement.Top) {
        Text(
            modifier = Modifier
                .offset(10.dp, 10.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text = "Description:" + "\n"
        )
        Text(modifier = Modifier.padding(10.dp),
            text = "Happiness and Positivity:\n" +
                    "Yellow is often associated with feelings of happiness, joy, and positivity. Its bright and cheerful nature can evoke a sense of optimism and energy. Yellow is a color that is frequently used to convey a positive and uplifting mood.\n" + "\n" +
                    "Sunshine and Light:\n" +
                    "Yellow is often linked to sunlight and light. As the color of the sun, yellow can symbolize warmth, light, and the beginning of a new day. It is commonly associated with feelings of brightness and clarity.\n" + "\n" +
                    "Creativity and Innovation:\n" +
                    "The color yellow is sometimes associated with creativity and innovation. It can stimulate mental activity and encourage fresh ideas. Yellow is often used in design and marketing to attract attention and convey a sense of creativity.\n" + "\n" +
                    "Attention and Visibility:\n" +
                    "Yellow is a highly visible color, and it is often used for warning signs, traffic signals, and cautionary messages. Its high visibility makes it effective for drawing attention and signaling alertness.\n" + "\n" +
                    "Energy and Youthfulness:\n" +
                    "Yellow is a vibrant color that can convey a sense of energy and youthfulness. It is often associated with a lively and enthusiastic approach to life. In fashion and design, yellow can be used to create dynamic and modern looks.\n" + "\n" +
                    "Caution and Warning:\n" +
                    "While yellow is associated with positive emotions, it is also used as a color of caution. Yellow is commonly used for warning signs and symbols to indicate potential hazards or alertness.\n" + "\n" +
                    "Cultural and Symbolic Variations:\n" +
                    "The symbolism of yellow can vary across different cultures. In some cultures, yellow may be associated with spirituality, enlightenment, or royalty, while in others, it may have different connotations")
        Text(modifier= Modifier.offset(10.dp, 10.dp),
            textAlign= TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text= "Best Paired With:"+"\n")
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(20.dp, 10.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(0, 35, 102)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(80.dp, (-30).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(128, 0, 32)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(140.dp, (-70).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(144, 238, 144)))
    }
}
@Composable
fun Grey_details(navController:NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp))
        .verticalScroll(rememberScrollState())
        .border(10.dp, Color.Gray, shape = RoundedCornerShape(10.dp))
        .background(Color(255, 228, 225)),
        verticalArrangement = Arrangement.Top) {
        Text(
            modifier = Modifier
                .offset(10.dp, 10.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text = "Description:" + "\n"
        )
        Text(
            modifier = Modifier.padding(10.dp),
            text="Neutrality: Grey is often seen as a neutral and balanced color, sitting between black and white. It can symbolize impartiality, calmness, and the absence of extremes.\n" + "\n"+
                    "Ambiguity: Grey is a color that lacks vibrancy and can be considered somewhat ambiguous. It is neither black nor white, representing a middle ground or a state of uncertainty.\n" + "\n"+
                    "Sophistication: Grey is often associated with sophistication, formality, and timelessness. It is a popular choice in fashion, design, and aesthetics to convey a sense of elegance and refinement.\n" + "\n"+
                    "Maturity: In some contexts, grey is linked to maturity and wisdom. As people age, their hair often turns grey, and this natural process is often associated with experience and knowledge.\n"+ "\n" +
                    "Depression or Gloom: Grey can also be associated with feelings of sadness, depression, or gloom. A grey and overcast sky, for example, might be symbolic of a somber mood or a challenging period.\n" + "\n"+
                    "Conformity: In certain situations, grey can symbolize conformity or a lack of individuality. This interpretation is often derived from the idea that grey represents blending in and avoiding attention.\n" + "\n"+
                    "Industrialism: Grey is frequently associated with urban and industrial settings. Concrete, steel, and other industrial materials often have a grey hue, and the color is symbolic of modernity and urban environments.\n"+ "\n" +
                    "Practicality: Grey is a practical and versatile color. It is often used for utilitarian purposes and can symbolize functionality, efficiency, and a lack of unnecessary embellishments."
        )
        Text(modifier= Modifier.offset(10.dp, 10.dp),
            textAlign= TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text= "Best Paired With:"+"\n")
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(20.dp, 10.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(102, 0, 102)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(80.dp, (-30).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(106, 90, 205)))
        Box(modifier = Modifier
            .width(40.dp)
            .height(40.dp)
            .offset(140.dp, (-70).dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(255, 215, 0)))
    }
}
@Preview(showBackground = true)
@Composable 
fun ShowDetails(){
    Grey_details(navController = rememberNavController())
}