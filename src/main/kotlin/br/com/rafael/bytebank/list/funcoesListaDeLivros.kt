package br.com.rafael.bytebank.list

fun List<Livro?>.imprimeComMarcadores() {
    val livrosComMarcadores = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor}"
    }
    println("\n### Lista de Livros ###\n$livrosComMarcadores"
    )
}
