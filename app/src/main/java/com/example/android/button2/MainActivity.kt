package com.example.android.button2

import  android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.button2.ui.theme.Button2Theme

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            val darkMode =remember{ mutableStateOf(false) }

            Button2Theme (darkTheme = darkMode.value){

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background


                ) {

                    Content(darkMode)



                }


            }
        }
    }

    @Composable
    fun Content(darkMode: MutableState<Boolean>){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            BotonNormal()
            Space()
            BottonNormal2()
            Space()
            BotonTexto()
            Space()
            BotonOutLine()
            Space()
            BotonIcono()
            Space()
            BotonSwitch()
            Space()
            DarkMode(darkMode = darkMode)
            Space()
            FloatingAction()
        }
    }}





