fun main() {

    //Evite aninhamentos profundos de if-else. Prefira usar when ou retornos diretos.

    val x = 15

    // Evitar:
    if (x > 10) {
        if (x < 20) {
            // Lógica
        }
    }

    // Melhor:
    if (x > 10 && x < 20) {
        // Lógica
    }

    //Utilize when para retornar valores, em vez de apenas verificar condições.

    val nota = 5

    val resultado = when {
        nota >= 7 -> "Aprovado"
        nota >= 5 -> "Recuperação"
        else -> "Reprovado"
    }

    //Sempre que possível, use loops (for, while) para evitar repetir blocos de código.

}