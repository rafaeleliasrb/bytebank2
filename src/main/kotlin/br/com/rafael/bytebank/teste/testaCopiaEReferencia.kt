package br.com.rafael.bytebank.teste

import br.com.rafael.bytebank.modelo.Cliente
import br.com.rafael.bytebank.modelo.ContaCorrente

fun testaCopiaEReferencia() {
    val contaJoao = ContaCorrente(Cliente(nome = "Joao", cpf = "", senha = 1), 1000)

    val contaMaria = contaJoao
    contaMaria.titular = Cliente(nome = "Maria", cpf = "", senha = 1)

    println("Titula joao ${contaJoao.titular.nome}")
    println("Titula maria ${contaMaria.titular.nome}")
}