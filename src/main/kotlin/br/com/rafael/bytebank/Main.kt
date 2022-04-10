package br.com.rafael.bytebank

import br.com.rafael.bytebank.modelo.Autenticavel
import br.com.rafael.bytebank.modelo.Cliente
import br.com.rafael.bytebank.modelo.Conta.Companion.totalConta
import br.com.rafael.bytebank.modelo.ContaCorrente
import br.com.rafael.bytebank.modelo.Endereco
import br.com.rafael.bytebank.teste.testaObject

fun main() {
//    testaContasDiferentes()
//    testaOperacoes()
//    testaObject()

    val endereco = Endereco(logradouro = "Rua da Assunção", cidade = "Fortaleza", cep = "60050-011")
    val enderecoNovo = Endereco(logradouro = "Rua da Assunção", cidade = "Fortaleza", cep = "60050-011")

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
}

fun testaAny(teste: Any) {
    println(teste)
}
