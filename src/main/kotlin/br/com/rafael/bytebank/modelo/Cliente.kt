package br.com.rafael.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int,
) : Autenticavel {
    override fun autenticar(valor: Int): Boolean {
        if (senha == valor) {
            return true
        }
        return false
    }
}