package br.com.rafael.bytebank.teste

import br.com.rafael.bytebank.exception.FalhaAutenticacaoException
import br.com.rafael.bytebank.exception.SaldoInsuficienteException
import br.com.rafael.bytebank.modelo.Cliente
import br.com.rafael.bytebank.modelo.ContaCorrente
import br.com.rafael.bytebank.modelo.ContaPoupanca
import br.com.rafael.bytebank.modelo.Endereco

fun testaOperacoesConta() {
    val contaLucio = ContaPoupanca(
        titular = Cliente(
            nome = "Lucio",
            cpf = "",
            senha = 1,
            endereco = Endereco(logradouro = "Rua da Assunção")),
        conta = 1000)
    contaLucio.depositar(10.0)

    val contaFernanda = ContaCorrente(conta = 1001,
        titular = Cliente(nome = "Fernanda", cpf = "", senha = 1))
    contaFernanda.depositar(20.0)

    println("Saldo ${contaLucio.titular.nome}: ${contaLucio.saldo}")

    val deposito = 100.0
    contaLucio.depositar(deposito)
    println("Saldo ${contaLucio.titular.nome} apos depósito de $deposito: ${contaLucio.saldo}")

    val saque = 50.0
    contaLucio.sacar(saque)
    println("Saldo ${contaLucio.titular.nome} apos saque de $saque: ${contaLucio.saldo}")

    val tranferencia = 10.0
    try {
        contaLucio.tranferir(valor = tranferencia, destino = contaFernanda, senha = 1)
        println("Valor transferido com sucesso")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transaferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transaferência")
        println("Falha na autenticacao")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println("Saldo final ${contaLucio.titular.nome}: ${contaLucio.saldo}")
    println("Saldo final ${contaFernanda.titular.nome}: ${contaFernanda.saldo}")

    println("${contaLucio.titular.nome} logradouro: ${contaLucio.titular.endereco.logradouro}")
}