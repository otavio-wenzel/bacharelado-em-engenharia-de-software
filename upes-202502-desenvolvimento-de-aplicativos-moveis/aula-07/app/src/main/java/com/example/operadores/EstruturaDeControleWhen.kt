fun main() {

    //Kotlin permite que você use estruturas de controle dentro de funções para modularizar
    // seu código e torná-lo mais legível.

    val resultado = avaliarNota(8)
    println(resultado)  // Saída: Aprovado

}

fun avaliarNota(nota: Int): String {
    return when {
        nota >= 7 -> "Aprovado"
        nota >= 5 -> "Recuperação"
        else -> "Reprovado"
    }

    //Modularize seu código usando funções para tornar suas condições e repetições mais reutilizáveis.
    //Prefira when quando tiver múltiplas condições a serem testadas, para manter o código limpo.

}

