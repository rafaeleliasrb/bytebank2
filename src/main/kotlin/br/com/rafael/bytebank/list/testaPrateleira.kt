package br.com.rafael.bytebank.list

import br.com.alura.list.livros

fun testaPrateleira() {
    val prateleira = Prateleira(genero = "Literatura", livros = livros)

    val porAutor = prateleira.organizaLivroPorAutor()
    val porAnoPublicacao = prateleira.organizaLivroPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}