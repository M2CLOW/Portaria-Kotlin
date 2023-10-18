package control

import business.ConvidadoBusiness
import entity.Convite

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade?")
        val convidado = Convite(idade = idade)
        if (!convidadoBusiness.maiorDeIdade(convidado.idade)) {
            return "Negado!, Menores de idade não são permitidos."
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite?")
        if (!convidadoBusiness.tipoValido(convidado.tipo)) {
            return "Negado!, Convite Inválido."
        }

        convidado.codigo = Console.readString("Qual é o código do convite?")
        if (!convidadoBusiness.codigoValido(convidado)) {
            return "Negado!, Convite Inválido."
        }

        return "Welcome! :)"
    }
}