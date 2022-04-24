package br.com.rafael.bytebank.list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizaLivroPorAutor(): List<Livro> {
        return livros
            .sortedBy { it.autor }
    }

    fun organizaLivroPorAnoPublicacao(): List<Livro> {
        return livros
            .sortedBy { it.anoPublicacao }
    }
}