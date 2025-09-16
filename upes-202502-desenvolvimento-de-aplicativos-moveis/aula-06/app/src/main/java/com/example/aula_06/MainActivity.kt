package com.example.aula_06

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.gson.Gson
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                AppNavigation()
            }
        }
    }
}

data class Personagem(val nome: String, val raca: String, val classe: String, val level: String)


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tela1"
    ) {
        composable("tela1") {
            Tela1(navController)
        }
        composable("tela2/{contatoJson}") { backStackEntry ->
            val personagemJson = backStackEntry.arguments?.getString("contatoJson")
            val personagem = Gson().fromJson(personagemJson, Personagem::class.java)
            Tela2(navController, personagem)
        }
    }
}

@Composable
fun Tela1(navController: NavController) {
    val personagens = listOf(
        Personagem("Légolas", "Elfo", "Arqueiro", "23"),
        Personagem("Godfier", "Humano", "Ranger", "17"),
        Personagem("Dratini", "Pokemon", "Dragão", "35"),
        Personagem("Aragor", "Anão", "Guerreiro", "30"),
        Personagem("Smurph", "Halfling", "Ladino", "20")
    )

    Column(
        Modifier
            .fillMaxSize()
            .padding(15.dp)){

        Text(text = "Lista de Personagens",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp)

        Spacer(modifier = Modifier.height(30.dp))

        LazyColumn {
            items(personagens) { personagem ->
                Text(
                    text = "${personagem.nome} - (${personagem.raca})",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            val personagemJson = Gson().toJson(personagem)
                            navController.navigate("tela2/$personagemJson")
                        }
                )
            }
        }

    }
}

@Composable
fun Tela2(navController: NavController, personagem: Personagem) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Nome: ${personagem.nome}")
        Text(text = "Espécie: ${personagem.raca}")
        Text(text = "Classe: ${personagem.classe}")
        Text(text = "Level: ${personagem.level}")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Voltar")
        }
    }
}