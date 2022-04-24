package br.com.rafael.bytebank.teste

import br.com.rafael.bytebank.modelo.Endereco

fun testaNullSafety() {
    val enderecoNulo: Endereco? = null
    val logradouro = enderecoNulo?.logradouro
    val length = enderecoNulo?.logradouro?.length
    println(logradouro)
    println(length)

    enderecoNulo?.let {
        println(it.logradouro.length)
    }

    testeCast("")

    val enderecoNuloNovo: Endereco? = null
    val teste: Endereco = enderecoNuloNovo ?: throw IllegalStateException("Endereco nulo")
}

fun testeCast(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}