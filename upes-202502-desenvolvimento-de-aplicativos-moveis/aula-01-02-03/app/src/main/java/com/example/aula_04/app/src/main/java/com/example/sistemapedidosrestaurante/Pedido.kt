package com.example.sistemapedidosrestaurante

class Pedido(val cliente: Cliente) {
    val itens = mutableListOf<Item>()

    fun adicionarItem(item: Item) {
        itens.add(item)
    }

    fun calcularTotal(): Double {
        val total = itens.sumOf { it.preco }
        return total - (total * cliente.cupomDesconto)
    }
}