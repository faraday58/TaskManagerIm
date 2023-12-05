package com.mexiti.taskmanagerim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mexiti.taskmanagerim.ui.theme.TaskManagerImTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerImTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MessageTask(message = "All tasks completed", congratulations = "Nice Work!" )
                }
            }
        }
    }
}

@Composable
fun MessageTask(message: String,congratulations:  String, modifier: Modifier = Modifier) {

        Column (
            verticalArrangement = Center,
            modifier =  modifier.fillMaxSize(),
        ) {
            val image = painterResource(id = R.drawable.ic_task_completed)
            Image(
                painter = image,
                contentDescription = null,
                modifier.align(
                    alignment = Alignment.CenterHorizontally
                )
            )

            Text(
                text = message,
                fontWeight = FontWeight.Bold ,
                modifier = modifier
                    .padding(top = 24.dp, bottom = 8.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = congratulations,
                fontSize = 16.sp,
                modifier = modifier
                    .align(Alignment.CenterHorizontally)

            )
        }



}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerImTheme {
        MessageTask(message = "All tasks completed", congratulations = "Nice Work!" )
    }
}