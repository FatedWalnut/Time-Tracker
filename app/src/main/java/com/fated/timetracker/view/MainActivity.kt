package com.fated.timetracker.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fated.timetracker.ui.theme.TimeTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimeTrackerTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(
        topBar = { TopBar() },
        floatingActionButton = { AddButton() }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            EstatisticasSection()
            ListaDeAtividades()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        title = { Text("Time Tracker") }
    )
}

@Composable
fun EstatisticasSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Estatísticas", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Total de Horas Rastreadas: -- h")
        }
    }
}

@Composable
fun ListaDeAtividades() {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        // Nenhuma atividade ainda
    }
}

@Composable
fun AddButton() {
    FloatingActionButton(
        onClick = { /* Ação de adicionar atividade */ }
    ) {
        Icon(imageVector = Icons.Default.Add, contentDescription = "Adicionar Atividade")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    TimeTrackerTheme {
        MainScreen()
    }
}