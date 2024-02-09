package com.navio.designing_patterns.factory

class Cat: Animal() {
    override fun makeSound(): String {
        return "Meow"
    }
}