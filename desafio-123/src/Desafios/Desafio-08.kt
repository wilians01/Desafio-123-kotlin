package Desafios

fun main() {
    print("Digite o dia: ")
    val dia = readLine()?.toIntOrNull()

    print("Digite o mês: ")
    val mes = readLine()?.toIntOrNull()

    if (dia != null && mes != null && dia in 1..30 && mes in 1..12) {
        val diasPassados = (mes - 1) * 30 + dia
        println("Dias passados desde o início do ano: $diasPassados")
    } else {
        println(" Entrada inválida. Certifique-se de inserir um dia entre 1 e 30 e um mês entre 1 e 12.")
    }
}