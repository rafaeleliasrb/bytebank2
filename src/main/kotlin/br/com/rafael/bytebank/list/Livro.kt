package br.com.rafael.bytebank.list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
): Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return anoPublicacao.compareTo(other = other.anoPublicacao)
    }
}