package br.com.rafael.bytebank.collections

fun testaSet() {
    val assistiramCursoAndroid = mutableSetOf("Lucio", "Fernanda", "Tonho", "Ze")
    val assistiramCursoJava = mutableSetOf("Lucio", "Pedro", "Tonho", "Cazalbe")
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoJava)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)
    println(assistiramCursoJava union assistiramCursoAndroid)
    println(assistiramCursoAndroid union assistiramCursoJava)
    println(assistiramCursoJava subtract assistiramCursoAndroid)
    println(assistiramCursoJava intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Ana")
    println(assistiramList)
    println(assistiramList.toSet())
}