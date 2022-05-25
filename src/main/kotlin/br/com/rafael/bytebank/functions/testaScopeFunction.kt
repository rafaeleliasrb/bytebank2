package br.com.rafael.bytebank.functions

import br.com.rafael.bytebank.modelo.Endereco

fun testaScopeFunction() {
    Endereco(
        logradouro = "rua tal",
        numero = 0,
        bairro = "algum",
        cidade = "townsville",
        estado = "BR",
        cep = "00000000"
    )
        .also { println("Cidade: ${it.cidade}") }
        .run { "$logradouro, $numero".uppercase() }
        .let { valor: String -> println(valor) }

    listOf(Endereco(complemento = "casa"), Endereco(), Endereco(complemento = "apartamento"))
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)

    run {
        println("Teste run sem extensão")
    }

    Endereco().apply {
        cidade = "Acapulco"
        logradouro = "praia"
    }.let(::println)

    val dez = 10
    with(dez) {
        plus(5)
    }.let(::println)
}