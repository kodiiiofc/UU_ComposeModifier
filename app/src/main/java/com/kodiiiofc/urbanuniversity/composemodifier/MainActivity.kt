package com.kodiiiofc.urbanuniversity.composemodifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Message(
                "Привет",
                Modifier
                    .border(2.dp, Color.Red, RectangleShape)
                    .background(Color.Yellow)
            )



        }
    }
}

@Composable
fun Message(
    message: String,
    modifier: Modifier = Modifier
) {
    val defaultModifier = Modifier
        .padding(top = 500.dp, bottom = 300.dp, start = 120.dp, end = 120.dp)
        .fillMaxSize()
        .border(2.dp, Color.Red, RectangleShape)
        .padding(12.dp)
    Text(
        text = message,
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        modifier = defaultModifier.then(modifier)
    )
}

@Preview(showSystemUi = true)
@Composable
fun MessagePreview() {
    
    val customModifier = Modifier
        .border(2.dp, Color.Red, RectangleShape)
        .background(Color.Yellow)

    Message(
        message = "Привет",
        modifier = customModifier
    )
}

@Composable
fun MessageSecond(
    message: String,
    modifier: Modifier = Modifier
) {
    val defaultModifier = Modifier
        .padding(16.dp)
        .fillMaxWidth()
    Text(
        text = message,
        fontSize = 24.sp,
        textAlign = TextAlign.Center,
        modifier = defaultModifier.then(modifier)
    )

}

@Preview (showSystemUi = true)
@Composable
fun MessageSecondPreview() {
    val customModifier = Modifier
        .clip(CircleShape)
        .size(360.dp)
        .background(Color.Cyan)
        .border(width = 2.dp, color = Color.Yellow, shape = CircleShape)
        .padding(top = 165.dp)

    MessageSecond("Привет",
        modifier = customModifier
            )
}