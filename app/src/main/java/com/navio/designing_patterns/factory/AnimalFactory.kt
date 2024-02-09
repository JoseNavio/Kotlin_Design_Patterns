package com.navio.designing_patterns.factory


class AnimalFactory {
    fun createDog(): Dog {
        return Dog()
    }

    fun createCat(): Cat {
        return Cat()
    }
}