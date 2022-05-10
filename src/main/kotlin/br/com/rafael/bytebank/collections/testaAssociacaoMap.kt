package br.com.rafael.bytebank.collections

fun testaAssociacaoMap() {
    val pedidos = listOf(
        Pedido(1, 30.0),
        Pedido(2, 46.6),
        Pedido(3, 13.2),
        Pedido(4, 74.0)
    )
    println(pedidos)


    val pedidosAssociate = pedidos.associate { pedido -> Pair(pedido.numero, pedido) }
    println(pedidosAssociate)

    val pedidosAssociateBy = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosAssociateBy)

    val pedidosAssociateWith = pedidos.associateWith { pedido -> pedido.valor > 40.0 }
    println(pedidosAssociateWith)

    val pedidosGroupBy = pedidos.groupBy { pedido -> pedido.valor > 40.0 }
    println(pedidosGroupBy)
    println(pedidosGroupBy[true])

    val nomes = listOf("Lucio", "Fernanda", "Pedro", "Raul", "Fibonacci", "Paulo")
    val agenda = nomes.groupBy { nome -> nome.first() }
    println(agenda)

}

data class Pedido(
    val numero: Int,
    val valor: Double
)