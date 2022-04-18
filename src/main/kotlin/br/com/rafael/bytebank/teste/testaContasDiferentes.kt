package br.com.rafael.bytebank.teste

import br.com.rafael.bytebank.modelo.Cliente
import br.com.rafael.bytebank.modelo.ContaCorrente
import br.com.rafael.bytebank.modelo.ContaPoupanca
import br.com.rafael.bytebank.modelo.ContaSalario

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Lucio", cpf = "", senha = 1,),
        conta = 1000,
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fernanda", cpf = "", senha = 1),
        conta = 1001,
    )

    val contaSalario = ContaSalario(
        titular = Cliente(nome = "Joao", cpf = "", senha = 1),
        conta = 1002,
    )

    contaCorrente.depositar(valor = 1000.0)
    contaPoupanca.depositar(valor = 1000.0)
    contaSalario.depositar(valor = 1000.0)

    contaCorrente.sacar(valor = 100.0)
    contaPoupanca.sacar(valor = 100.0)
    contaSalario.sacar(valor = 100.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")
    println("Saldo conta salário após saque: ${contaSalario.saldo}")

    contaCorrente.tranferir(valor = 100.0, destino = contaPoupanca, senha = 1)

    println("Saldo conta corrente após transferir: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaCorrente.tranferir(valor = 100.0, destino = contaSalario, senha = 2)

    println("Saldo conta corrente após transferir: ${contaCorrente.saldo}")
    println("Saldo conta salário após receber transferência: ${contaSalario.saldo}")
}