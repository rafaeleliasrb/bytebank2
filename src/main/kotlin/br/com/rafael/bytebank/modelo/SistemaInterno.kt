package br.com.rafael.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if(admin.autenticar(senha)) {
            println("Bem vindo ao ByteBank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if(admin.autenticar(senha)) {
            println("Bem vindo ao ByteBank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }

    fun pagamento() {
        println("Efetuando pagamento")
    }
}