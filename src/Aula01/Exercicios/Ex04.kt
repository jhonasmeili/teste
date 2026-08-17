package Aula01.Exercicios

fun main(){
    print("Digite um número: ")
    var n1: Double = readln().toDouble()
    print("Digite outro numero: ")
    var n2: Double = readln().toDouble()
    print("Digite mais um numero: ")
    var n3: Double = readln().toDouble()

    var soma = (n1 + n2 + n3) / 3

    if(soma >= 6){
        println("Aprovado.")
    } else if (soma >= 4){
        println("Recuperação.")
    } else {
        println("Reprovado.");
    }
}