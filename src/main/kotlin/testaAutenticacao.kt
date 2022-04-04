fun testaAutenticacao() {
    val diretor = Diretor(
        nome = "Lucio",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1234,
        plr = 200.0
    )

    val gerente = Gerente(
        nome = "Fernanda",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 9876,
    )

    val cliente = Cliente(
        nome = "Joao",
        cpf = "333.333.333-33",
        senha = 1111
    )

    val sistema = SistemaInterno()
    sistema.entra(diretor, 1000)
    sistema.entra(gerente, 9876)
    sistema.entra(cliente, 1111)
}