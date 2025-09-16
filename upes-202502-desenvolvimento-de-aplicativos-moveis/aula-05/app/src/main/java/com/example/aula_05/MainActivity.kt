package com.example.myapplication

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


// A atividade principal do aplicativo.
class MainActivity : ComponentActivity() {
    // O método onCreate é chamado quando a atividade é criada.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 'setContent' é o ponto de entrada para a UI do Jetpack Compose.
        setContent {
            // 'Surface' é um contêiner que aplica um fundo e elevação, seguindo o Material Design.
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                // Chama nosso Composable 'AppNavigation', que inicializa o NavHost e define as rotas.
                // É aqui que a navegação do aplicativo começa.
                AppNavigation()
            }
        }
    }
}

data class Contato(val nome: String, val telefone: String)

// @Composable indica que esta função descreve um componente de UI.
@Composable
fun AppNavigation() {
    // Cria e armazena uma instância do NavController, que sobrevive a recomposições.
    // Este controlador é o cérebro da navegação.
    val navController = rememberNavController()

    // NavHost é o contêiner que exibe o destino (tela) atual da navegação.
    NavHost(
        navController = navController,         // Associa o controlador à hierarquia de navegação.
        startDestination = "tela1"              // Define a rota que será exibida ao iniciar.
    ) {
        // Define a primeira rota, chamada "tela1".
        composable("tela1") {
            // Quando a rota "tela1" for acessada, o Composable Tela1 será exibido.
            // Passamos o navController para a Tela1 para que ela possa iniciar a navegação para outras telas.
            Tela1(navController)
        }
        // Define a segunda rota, "tela2", que aceita um argumento chamado "contatoJson".
        // A sintaxe "{argumento}" cria um placeholder na rota para receber dados.
        composable("tela2/{contatoJson}") { backStackEntry ->
            // O lambda 'composable' nos dá acesso ao 'backStackEntry', que contém os argumentos passados.
            // Extrai o argumento "contatoJson" da rota. A chave deve ser a mesma definida no placeholder.
            val contatoJson = backStackEntry.arguments?.getString("contatoJson")

            // Usa a biblioteca Gson para deserializar a string JSON de volta para um objeto da classe Contato.
            val contato = Gson().fromJson(contatoJson, Contato::class.java)

            // Exibe a Tela2, passando o objeto 'contato' já reconstruído.
            Tela2(navController, contato)
        }
    }
}

@Composable
fun Tela1(navController: NavController) {
    // Cria uma lista estática de contatos como fonte de dados.
    val contatos = listOf(
        Contato("João", "9999-1234"),
        Contato("Maria", "8888-5678"),
        Contato("Carlos", "7777-9101")
    )

    Column(
        Modifier
            .fillMaxSize()
            .padding(15.dp)){

        Text(text = "Lista de Contatos",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp)

        Spacer(modifier = Modifier.height(30.dp))

        // LazyColumn é usado para exibir a lista de forma eficiente, renderizando apenas os itens visíveis.
        LazyColumn {
            // 'items' itera sobre a lista de 'contatos'. O lambda é executado para cada 'contato' na lista.
            items(contatos) { contato ->
                // Exibe um Composable de Texto para cada contato.
                Text(
                    text = "${contato.nome} - ${contato.telefone}",
                    // O Modifier torna este Text clicável.
                    modifier = Modifier
                        .padding(16.dp) // Adiciona um espaçamento para facilitar o clique.
                        .clickable {
                            // AÇÃO DO CLIQUE:
                            // 1. Serializa o objeto 'contato' atual para uma string no formato JSON.
                            val contatoJson = Gson().toJson(contato)
                            // 2. Navega para a rota "tela2", passando a string 'contatoJson' como argumento.
                            // O valor de 'contatoJson' substituirá o placeholder {contatoJson} na definição da rota.
                            navController.navigate("tela2/$contatoJson")
                        }
                )
            }
        }

    }
}

@Composable
fun Tela2(navController: NavController, contato: Contato) {
    // Column para organizar o conteúdo verticalmente e centralizá-lo.
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Exibe o nome do contato, acessando a propriedade '.nome' do objeto recebido.
        Text(text = "Nome: ${contato.nome}")
        // Exibe o telefone do contato, acessando a propriedade '.telefone'.
        Text(text = "Telefone: ${contato.telefone}")

        // Adiciona um espaço entre o texto e o botão.
        Spacer(modifier = Modifier.height(16.dp))

        // Botão para retornar à tela anterior.
        Button(onClick = {
            // Chama 'popBackStack' para remover a tela atual da pilha de navegação e voltar para a Tela1.
            navController.popBackStack()
        }) {
            // Texto do botão.
            Text("Voltar")
        }
    }
}