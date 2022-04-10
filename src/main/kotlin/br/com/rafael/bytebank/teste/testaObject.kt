package br.com.rafael.bytebank.teste

import br.com.rafael.bytebank.modelo.Autenticavel
import br.com.rafael.bytebank.modelo.Cliente
import br.com.rafael.bytebank.modelo.Conta
import br.com.rafael.bytebank.modelo.ContaCorrente

fun testaObject() {
    val conta1 = ContaCorrente(titular = Cliente(nome = "Lucio", cpf = "", senha = 1), conta = 1)
    val conta2 = ContaCorrente(titular = Cliente(nome = "Fernanda", cpf = "", senha = 2), conta = 2)

    println(" Total de contas ${Conta.totalConta}")

    val lucia = object : Autenticavel {
        val nome: String = "Lucia"
        val senha: Int = 1000
        override fun autenticar(valor: Int) = this.senha == senha
    }
}
