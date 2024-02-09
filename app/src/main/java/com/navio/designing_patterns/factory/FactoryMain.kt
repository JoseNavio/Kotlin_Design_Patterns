package com.navio.designing_patterns.factory

fun main() {
    val dog = AnimalFactory().createDog()
    println(dog.makeSound())
    val cat = AnimalFactory().createCat()
    println(cat.makeSound())
}