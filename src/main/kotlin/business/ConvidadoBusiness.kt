package business

import entity.Convite

class ConvidadoBusiness {

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun tipoValido(tipo: String) = (tipo == "comun" || tipo == "premium" || tipo == "luxo")

    fun codigoValido(convite: Convite) = when (convite.tipo) {
        "comun" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }
}