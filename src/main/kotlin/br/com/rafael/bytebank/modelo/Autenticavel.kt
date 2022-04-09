package br.com.rafael.bytebank.modelo

interface Autenticavel {

    fun autenticar(valor: Int): Boolean
}