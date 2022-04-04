class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int,
) : Autenticavel {
    override fun autenticar(valor: Int): Boolean {
        if (senha == valor) {
            return true
        }
        return false
    }
}