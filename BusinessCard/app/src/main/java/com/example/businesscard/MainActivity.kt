package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Logo()
                }
            }
        }
    }
}

@Composable
fun Logo() {
    val image = painterResource(R.drawable.android_logo)
    Column(verticalArrangement = Arrangement.Center,) {
        Row(horizontalArrangement = Arrangement.Center,) {
            Image(painter = image, contentDescription = null)
        }
        Row {
            Text(text = "Thomas Witmer",
                fontSize = 50.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center)
        }
        Row(horizontalArrangement = Arrangement.Center,) {
            Text(
                text = "Student",
                fontSize = 24
                    .sp,
                //modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
            )
        }
    }
}

@Composable
fun Info() {
    Column(verticalArrangement = Arrangement.Center,){
        Text(text = "Thomas Witmer")
        Text(text = "")
        Text(text = "")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Logo()
    }
}