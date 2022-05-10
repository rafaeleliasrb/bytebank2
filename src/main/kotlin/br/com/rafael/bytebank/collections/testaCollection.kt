package br.com.rafael.bytebank.collections

fun testaCollection() {

    val banco = BancoDeDados()
    val testeMutable: Collection<String> = banco.nomes
    banco.salvar(novoDado = "Alex")
    println(testeMutable)
    println(BancoDeDados().nomes)
}

class BancoDeDados {
    val nomes: Collection<String> get() = dados.toList()

    fun salvar(novoDado: String) {
        dados.add(novoDado)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}