package br.com.rafael.bytebank.teste

import br.com.rafael.bytebank.modelo.Analista
import br.com.rafael.bytebank.modelo.CalculadoraBonificacao
import br.com.rafael.bytebank.modelo.Diretor
import br.com.rafael.bytebank.modelo.Gerente

fun testaFuncionario() {
    val lucio = Analista(
        nome = "Lucio",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )

    println("nome ${lucio.nome}")
    println("cpf ${lucio.cpf}")
    println("salário ${lucio.salario}")
    println("bonificação ${lucio.bonificacao}")

    println("--------------------------------")
    println()

    val fernanda = Gerente(
        nome = "Fernanda",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2222,
    )

    println("nome ${fernanda.nome}")
    println("cpf ${fernanda.cpf}")
    println("salário ${fernanda.salario}")
    println("bonificação ${fernanda.bonificacao}")
    if (fernanda.autenticar(valor = 2222)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    println("--------------------------------")
    println()

    val noah = Diretor(
        nome = "Noah",
        cpf = "333.333.333-33",
        salario = 3000.0,
        senha = 3333,
        plr = 500.0,
    )

    println("nome ${noah.nome}")
    println("cpf ${noah.cpf}")
    println("salário ${noah.salario}")
    println("bonificação ${noah.bonificacao}")
    if (noah.autenticar(valor = 2222)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(lucio)
    calculadoraBonificacao.registra(fernanda)
    calculadoraBonificacao.registra(noah)

    println("Total bonificação ${calculadoraBonificacao.total}")
}