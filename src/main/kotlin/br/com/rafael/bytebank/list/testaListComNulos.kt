package br.com.rafael.bytebank.list

import br.com.alura.list.livros
import br.com.alura.list.livrosComNulos

fun testaListComNulos() {
    livrosComNulos.imprimeComMarcadores()

    println()

    livros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}