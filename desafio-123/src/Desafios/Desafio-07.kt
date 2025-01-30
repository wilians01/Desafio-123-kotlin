package Desafios

fun main() {
    // cálculo do prato feito
    fun conversao(prato: Double): Double{
        val peso = prato * 14.00
        return peso
    }
    println("Informe quantos quilogramas ou quantas gramas deu seu prato ")
    println("Exemplo: para Kg( 1.0 ) e para Grama(0.000)")
    val prato : Double? = readLine()?.toDoubleOrNull()

    if (prato!=null){
        println("O valor a pagar do seu prato é R$ %.2f !!!".format(conversao(prato)))
    }else{
        println("Peso inválido. Por favor, insira um valor válido.")
    }
}


