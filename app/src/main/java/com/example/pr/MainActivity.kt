package com.example.pr

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr.ui.theme.ComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {

                Surface(
                        color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage()
                }
            }
        }
    }
}

@Composable
fun GreetingImage() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Box() {
            Image(
                    painter = painterResource(R.drawable.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    alpha = 0.9F,
                    modifier = Modifier.size(420.dp, 327.dp)
            )
            Box(modifier = Modifier
                    .padding(top = 296.dp)
                    .background(color = Color(0xFF050B18))){
                Column(
                        modifier = Modifier
                                .padding(start = 24.dp, top = 75.dp)
                )
                {
                    Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier
                                    .size(250.dp, 40.dp)
                                    .padding(top = 12.dp)
                    ) {
                        Label(
                                text = "MOBA",
                                modifier = Modifier
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(color = Color(0x2344A9F4))
                                        .size(53.dp, 22.dp)
                        )
                        Label(
                                text = "MULTIPLAYER", modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = Color(0x2344A9F4))
                                .size(99.dp, 22.dp)
                        )
                        Label(
                                text = "STRATEGY", modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = Color(0x2344A9F4))
                                .size(99.dp, 22.dp)
                        )

                    }

                    val text =
                            "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Anoient\", whilst defending their own."
                    Text(
                            text = text,
                            maxLines = 4,
                            fontSize = 11.sp,
                            lineHeight = 16.sp,
                            modifier = Modifier
                                    .size(327.dp, 90.dp)
                                    .padding(top = 24.dp),
                            color = Color(0x99EEF2FB)
                    )
                    ViewImage()

                    ReviewDota()
                    MessageReviews(
                            painter = painterResource(R.drawable.auguste),
                            author = "Auguste Conte",
                            date = "February 14, 2019"
                    )

                    Canvas(
                            modifier = Modifier
                                    .fillMaxSize()
                                    .padding(16.dp)
                    ) {

                        val canvasWidth = 800f
                        val canvasHeight = size.height

                        drawLine(
                                start = Offset(x = canvasWidth, y = 0f),
                                end = Offset(x = 30f, y = canvasHeight),
                                color = Color(0xFF1A1F29),
                                strokeWidth = 5F
                        )
                    }

                    MessageReviews(
                            painter = painterResource(R.drawable.jang),
                            author = "Jang Marcelino",
                            date = "February 14, 2019"
                    )

                    Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                    contentColor = Color.Black,
                                    containerColor = Color(0xFFF4D144)
                            ),
                            modifier = Modifier
                                    .size(327.dp, 70.dp)
                                    .padding(top = 14.dp),
                            shape = RoundedCornerShape(12.dp)

                    )
                    {
                        Text(text = "Install", fontSize = 20.sp)
                    }
                }

            }
            LogoDota()
        }

    }
}

@Composable
fun Label(text: String, modifier: Modifier)
{
    Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
    ) {
        Text(
                text = text,
                fontSize = 12.sp,
                color = Color(0xFF44A9F4)
        )
    }

}
@Composable
fun ReviewDota(){
    Column() {
        Text(
                text = "Review & Ratings",
                modifier = Modifier
                        .padding(top = 20.dp)
                        .size(137.dp, 21.dp),
                fontSize = 16.sp,
                color = Color(0xFFEEF2FB)
        )
        Row(modifier = Modifier
                .size(161.dp, 58.dp)
        ) {
            Text(text = "4.9",
                    fontSize = 45.sp,
                    color = Color.White
            )
            Column (modifier = Modifier.padding(start=10.dp)){
                Row(horizontalArrangement = Arrangement.spacedBy(2.dp),
                        modifier = Modifier
                                .size(130.dp, 30.dp)
                                .padding(top = 14.dp)) {
                    Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = null,
                            alpha = 1.0F,
                            modifier = Modifier
                                    .size(15.dp, 15.dp)

                    )
                    Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = null,
                            alpha = 1.0F,
                            modifier = Modifier
                                    .size(15.dp, 15.dp)
                    )
                    Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = null,
                            alpha = 1.0F,
                            modifier = Modifier
                                    .size(15.dp, 15.dp)
                    )
                    Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = null,
                            alpha = 1.0F,
                            modifier = Modifier
                                    .size(15.dp, 15.dp)
                    )
                    Image(
                            painter = painterResource(R.drawable.half_star),
                            contentDescription = null,
                            alpha = 1.0F,
                            modifier = Modifier
                                    .size(15.dp, 15.dp)
                    )
                }
                Text(text = "70M Reviews",
                        fontSize = 13.sp,
                        color = Color(0xFFA8ADB7),
                        modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}


@Composable
fun LogoDota(){
    Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 274.dp)
    ) {
        Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                        .size(82.dp, 82.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = Color(0xFF000000))
                        .border(
                                2.dp, color = Color(0xFF1F2430), RoundedCornerShape(10.dp),
                        )
        ) {
            Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = null,
                    alpha = 1.0F,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                            .size(56.dp, 56.dp)
                            .padding(4.dp)
                            .clip(
                                    RoundedCornerShape(0.dp)
                            )
            )
        }
        Column(modifier = Modifier
                .size(130.dp, 86.dp)
                .padding(start = 12.dp, top = 29.dp)) {

            Text(
                    text = "Dota 2",
                    color = Color(0xFFEEF2FB),
                    fontSize = 22.sp,
                    lineHeight = 24.sp,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Bold,
            )

            Row(
                    horizontalArrangement = Arrangement.spacedBy(3.dp),
                    modifier = Modifier
                            .size(130.dp, 20.dp)
                            .padding(top = 2.dp)
            ) {
                Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                                .size(13.dp, 13.dp)
                                .padding(top = 2.dp)

                )
                Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                                .size(13.dp, 13.dp)
                                .padding(top = 2.dp)
                )
                Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                                .size(13.dp, 13.dp)
                                .padding(top = 2.dp)
                )
                Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                                .size(13.dp, 13.dp)
                                .padding(top = 2.dp)
                )
                Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                                .size(13.dp, 13.dp)
                                .padding(top = 2.dp)
                )
                Text(
                        text = "70M",
                        fontSize = 12.sp,
                        modifier = Modifier
                                .size(50.dp, 15.dp)
                                .padding(start = 5.dp),
                        color = Color(0xFF45454D),
                )
            }
        }

    }
}
@Composable
fun ViewImage()
{
    val context = LocalContext.current
    LazyRow(
            modifier = Modifier.padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Box(contentAlignment = Alignment.Center) {
                Image(

                        painter = painterResource(R.drawable.screen1),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                                .size(240.dp, 128.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .clickable {
                                    Toast
                                            .makeText(context, "Video", Toast.LENGTH_SHORT)
                                            .show()
                                }
                )
                Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                                .size(48.dp, 48.dp)
                                .clip(CircleShape)
                                .background(color = Color(0x35FFFFFF))
                ) {
                    Image(
                            painter = painterResource(id = R.drawable.play_button),
                            contentDescription = null,
                            modifier = Modifier
                                    .size(25.dp)
                                    .align(Alignment.Center)
                    )
                }

            }
        }
        item {
            Image(
                    painter = painterResource(R.drawable.screen2),
                    contentDescription = null,
                    modifier = Modifier
                            .size(240.dp, 128.dp)
            )
        }

    }
}

@Composable
fun MessageReviews(painter: Painter, author: String, date: String){
    Column(modifier = Modifier.padding(top = 20.dp)) {
        Row {
            Image(
                    painter = painter,
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                            .size(36.dp, 36.dp)
                            .clip(CircleShape)
            )
            Column(modifier = Modifier.padding(start = 12.dp)) {
                Text(
                        text = author,
                        color = Color(0xFFEEF2FB),
                        modifier = Modifier.size(114.dp, 19.dp),
                        fontSize = 13.sp)
                Text(
                        text = date,
                        color = Color(0x60FFFFFF),
                        modifier = Modifier.size(102.dp, 14.dp),
                        fontSize = 9.sp)
            }

        }
        Column(modifier = Modifier.padding(top = 14.dp)){
            val text = "\"Once you start to learn its secrets, there's a wild and exciting variety of play here that's unmatched, even by its peers.\""
            Text(
                    text = text,
                    color = Color(0xFFA8ADB7),
                    modifier = Modifier.size(327.dp, 65.dp),
                    fontSize = 12.sp,
                    lineHeight = 16.sp
            )
        }
    }
}







@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTheme {
        GreetingImage()
    }
}