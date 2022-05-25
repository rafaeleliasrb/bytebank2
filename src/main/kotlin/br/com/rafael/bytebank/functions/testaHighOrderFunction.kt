package br.com.rafael.bytebank.functions

import br.com.rafael.bytebank.modelo.*

fun testaHighOrderFunction() {
    val testeFuncao: () -> Unit
    Endereco().let {
        it
    }
    "".let(::testeRecebeString)
    1.let {
        it
    }
    teste(1) {}

    multiplica(2, 3, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autenticar(valor: Int): Boolean = senha == valor
    }

    SistemaInterno().entra(admin = autenticavel, senha = 1234, autenticado = {
        println("Realiza pagamento")
    })

    testaWith()

    testaRun()

    multiplicaReceiver(2, 3, resultado = {
        println(this)
    })

    SistemaInterno().entraReceiver(admin = autenticavel, senha = 1234, autenticado = {
        pagamento()
    })
}

private fun testaRun() {
    val taxaMensal = 0.01
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Chico", cpf = "00000", senha = 1234),
        conta = 123
    )

    println("Taxa mensal $taxaMensal")

    contaPoupanca.run {
        depositar(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Saldo mensal: $rendimentoMensal")
    }

    run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }.let { saldoAnual ->
        println("Saldo anual: $saldoAnual")
    }
}

private fun testaWith() {
    with(Endereco()) {
        logradouro = "rua tal"
        numero = 0
        bairro = "algum"
        cidade = "townsville"
        estado = "AA"
        cep = "00000000"
        complemento = "Apto 0001"
        completo()
    }.let(::println)
}

fun multiplica(a: Int, b: Int, resultado: (c: Int) -> Unit) {
    println("Efetuando multiplicacao...")
    resultado(a * b)
    println("Multiplicacao efetuata")
}

fun multiplicaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Efetuando multiplicacao...")
    resultado(a * b)
    println("Multiplicacao efetuata")
}

fun testeRecebeString(valor: String) {

}

fun teste(a: Int, bloco: () -> Unit) {

}
