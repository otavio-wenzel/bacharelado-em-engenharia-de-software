fun main() {

    //A estrutura when é similar ao switch de outras linguagens, mas muito mais poderosa.
    // Ela pode ser usada para testar valores de diferentes tipos e executar diferentes blocos
    // de código dependendo do valor.

    val diaDaSemana = 3

    when (diaDaSemana) {
        1 -> println("Segunda-feira")
        2 -> println("Terça-feira")
        3 -> println("Quarta-feira")
        4 -> println("Quinta-feira")
        5 -> println("Sexta-feira")
        else -> println("Final de semana")
    }

    //Assim como o if, o when também pode ser usado como uma expressão, retornando um valor.

    val nota = 7

    val resultado = when {
        nota >= 7 -> "Aprovado"
        nota >= 5 -> "Recuperação"
        else -> "Reprovado"
    }
    println(resultado)  // Saída: Aprovado

    //Use when em vez de múltiplos if-else aninhados para melhorar a legibilidade.
    //Sempre cubra todos os casos possíveis no when, especialmente usando else como um caso padrão.

}