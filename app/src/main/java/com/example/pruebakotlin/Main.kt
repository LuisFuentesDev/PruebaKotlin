package com.example.pruebakotlin

fun main() {

    println("ingrese un valor")
    val input = readLine()!!.toDouble()

    val celciusToFahrenheit = (input * 9/5) + 32
    println("farhenheit $celciusToFahrenheit")

    val kelvinToCelcius = input + 273.15
    println("celcius $kelvinToCelcius")

    val fahrenheitToKelvin = 5.0/9.0 * (celciusToFahrenheit - 32) + 273.15
    println("kelvin $fahrenheitToKelvin")



}
fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}