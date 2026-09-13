package com.touchline26.app
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class NativeHomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                var status by remember { mutableStateOf("Motor nativo listo") }
                Column(
                    Modifier.fillMaxSize().padding(24.dp),
                    Arrangement.Center, Alignment.CenterHorizontally
                ) {
                    Text("TOUCHLINE 26", style = MaterialTheme.typography.headlineLarge)
                    Text("Gestor de fútbol para Android", Modifier.padding(top = 8.dp))
                    Text(status, Modifier.padding(top = 16.dp))
                    Button(
                        onClick = { status = "Partidos · cantera · temporadas · base local" },
                        Modifier.padding(top = 20.dp)
                    ) { Text("Iniciar") }
                }
            }
        }
    }
}
