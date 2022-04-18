package br.com.rafael.bytebank.modelo

import br.com.rafael.bytebank.exception.FalhaAutenticacaoException
import br.com.rafael.bytebank.exception.SaldoInsuficienteException

abstract class ContaAvancada(
    titular: Cliente,
    conta: Int,
) : Conta(
    titular = titular,
    conta = conta,
) {
    fun tranferir(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "Saldo insuficiente, saldo em conta: $saldo, e valor a transferir: $valor")
        }

        if (!autenticar(senha)) {
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.depositar(valor)
    }
}
