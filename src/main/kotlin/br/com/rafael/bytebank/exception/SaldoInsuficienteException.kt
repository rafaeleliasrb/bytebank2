package br.com.rafael.bytebank.exception

class SaldoInsuficienteException(
    mensagem: String = "Saldo insuficiente"
): Exception(mensagem) {
}
