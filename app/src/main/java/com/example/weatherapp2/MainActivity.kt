package com.example.weatherapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.weatherapp2.ui.theme.WeatherApp2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // make the app screen behind the status bar and navigation bar
        setContent { // we are defining the jetpack compose here
            WeatherApp2Theme { //applies my app theme
                Scaffold(modifier = Modifier.fillMaxSize()) //makes the scaffold occupy the whole screen
                { innerPadding ->  //ensures the systems ui dont overlap with the system ui
                   Greeting(modifier = Modifier.padding(innerPadding)) //innnerpadding have some default values
                }
            }
        }
    }
    @Composable
    fun Greeting(modifier: Modifier = Modifier){
        GetGreeting("Android", modifier)    
    }
    @Composable
    fun GetGreeting( name: String, modifier: Modifier = Modifier){
        Text(
            text =  "Hello $name",
            modifier = modifier,
            color = Color.Red,
            fontSize = 24.sp
        ) //text function writes actual text on the screen
    }
}

