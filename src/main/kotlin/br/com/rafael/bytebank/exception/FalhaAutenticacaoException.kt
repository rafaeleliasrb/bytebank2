package br.com.rafael.bytebank.exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticacao"
): Exception(mensagem) {
}