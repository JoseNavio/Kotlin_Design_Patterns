package com.navio.designing_patterns.factory

class Dog: Animal(){
    override fun makeSound(): String {
        return "Woof"
    }
}