package com.example.isweartohell

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.isweartohell.ui.theme.IsweartohellTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.runtime.remember
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.Image

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IsweartohellTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //GreetingText(message = "Happy Birthday Liam!")
                    GreetingImage(message = "Liam O'Donnell", from ="Student")
                    otherthing(message = "Im dying")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

        Text(

            text = "Hello $name!",
            modifier = modifier.padding(24.dp)
        )

}
@Composable
fun GreetingText(message: String,modifier: Modifier = Modifier) {
    //Surface(color = Color.Red) {
        Text(

            color = Color.White,
            text = message,
            fontSize = 100.sp,
            lineHeight = 300.sp,
            modifier = modifier.padding(24.dp)
        )
    //}
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    IsweartohellTheme {
        otherthing(message = "Im dying")
        GreetingImage(message = "Liam O'Donnell", from ="Student")

    }
}
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_launcher_foreground)
    //Step 3 create a box to overlap image and texts
    Box {

        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
        Image(
            modifier = modifier
                .padding(100.dp)
                .size(500.dp),
                //.fillMaxSize(),
            painter = image,

            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun otherthing(message: String, modifier: Modifier = Modifier)
{
    val image1 = painterResource(R.drawable.call_fill0_wght400_grad0_opsz48)
    val image2 = painterResource(R.drawable.alternate_email_fill0_wght400_grad0_opsz48)
    val image3 = painterResource(R.drawable.mail_fill0_wght400_grad0_opsz48)
    Column(

        //verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(150.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row() {
            Image(
                modifier = modifier
                    .padding(0.dp)
                    .size(30.dp),
                //.fillMaxSize(),
                painter = image1,

                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                //modifier = modifier.padding(100.dp),
                color = Color.White,
                text = "     +1 (000) 000-0000",
                fontSize = 15.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
            )
        }
        Row() {
            Image(
                modifier = modifier
                    .padding(0.dp)
                    .size(30.dp),
                //.fillMaxSize(),
                painter = image2,

                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                    //modifier = modifier.padding(100.dp),
                    color = Color.White,
            text = "     @totallyrealhandle",
            fontSize = 15.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            )
        }
        Row() {
            Image(
                modifier = modifier
                    .padding(0.dp)
                    .size(30.dp),
                //.fillMaxSize(),
                painter = image3,

                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                //modifier = modifier.padding(100.dp),
                color = Color.White,
                text = "     email@domain.com",
                fontSize = 15.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
            )
        }

    }

}
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {


    Surface(color = Color.Red) {
        Column(

            //verticalArrangement = Arrangement.Center,
            modifier = modifier.padding(30.dp),
                    verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                //modifier = modifier.padding(100.dp),
                color = Color.White,
                text = message,
                fontSize = 50.sp,
                lineHeight = 500.sp,
                textAlign = TextAlign.Center,
            )
            Text(
                color = Color.White,
                text = from,
                fontSize = 36.sp,
                lineHeight = 100.sp,
                textAlign = TextAlign.Center,
                style = TextStyle.Default,
            )

        }
    }}




