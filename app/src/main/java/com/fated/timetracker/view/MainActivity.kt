package com.fated.timetracker.view

import com.fated.timetracker.ui.theme.primaryBackground
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fated.timetracker.ui.theme.TimeTrackerTheme
import com.fated.timetracker.ui.theme.*
import com.fated.timetracker.viewmodel.MainViewModel
import com.fated.timetracker.viewmodel.MainViewModel2

private val viewModel = MainViewModel2()




class MainActivity : ComponentActivity() {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("chegou no onCreate()")
        setContent {
            PaginaInicial()
        }
    }

    override fun onStart() {
        super.onStart()
        println("chegou no onStart()")
    }

    override fun onResume() {
        super.onResume()
        println("chegou no onResume()")
    }
    override fun onPause() {
        super.onPause()
        println("chegou no onPause()")
    }
    override fun onStop() {
        super.onStop()
        println("chegou no onStop()")
    }
    override fun onDestroy() {
        super.onDestroy()
        println("chegou no onDestroy()")
    }
    override fun onRestart() {
        super.onRestart()
        println("chegou no onRestart()")
    }

}




@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun PaginaInicial() {
    val backgroundColor = if (isSystemInDarkTheme()) primaryBackground else secondaryBackground

    Box(
        Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Column {
            Box(modifier = Modifier.fillMaxWidth()
                .background(secondaryBox).
                height(40.dp)
                    .clip(shape = RoundedCornerShape(16.dp)))
        }
        Text(text = "Teste Cores",
            color = textColorPrimary,
            modifier = Modifier.fillMaxSize().wrapContentWidth(Alignment.CenterHorizontally).padding(top = 10.dp))


        }
    }


@Composable
fun HeadPaginaInicial() {
    Text(text = "Bem vindo")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TimeTrackerTheme {
        PaginaInicial()
    }
}