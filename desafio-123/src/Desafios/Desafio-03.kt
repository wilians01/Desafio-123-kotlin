package Desafios

fun main() {
    println("Digite dois números que irão resultar em operações de matemática  !!!")
    println("Digite o primeiro numero:")
    val numero1 = readLine()?.toDoubleOrNull()

    println("Digite o segundo numero:")
    val numero2 = readLine()?.toDoubleOrNull()



    if (numero1 != null && numero2 != null ){
        println("A soma dos dois numeros é: ${numero1 + numero2} ")
        println("A Subtração dos dois numeros é: ${numero1 - numero2} ")
        println("A multiplicação dos dois numeros é: ${numero1 * numero2} ")
        if (numero2 != 0.0){
            println("A divisão dos dois numeros é:${numero1/numero2}")
        }else{
            println("A divisão não é posssivel (dividisão por zero).")
        }
    }else{
        println("Por favor, insira números validos! ")
    }






}