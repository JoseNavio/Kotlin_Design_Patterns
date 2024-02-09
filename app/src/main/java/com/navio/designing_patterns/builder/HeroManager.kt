package com.navio.designing_patterns.builder

class HeroManager {

    fun createSuperman(): Hero {
        return HeroBuilder()
            .setName("Superman")
            .setAge(25u)
            .setPower("Super strength")
            .setWeakness("Kryptonite")
            .setIsVillain(false)
            .build()
    }

    fun createJoker(): Hero {
        return HeroBuilder()
            .setName("Joker")
            .setAge(30u)
            .setPower("Criminal genius")
            .setWeakness("Laughter")
            .setIsVillain(true)
            .build()
    }
}

//fun main () {
//        val heroManager = HeroManager()
//        val joker = heroManager.createJoker(HeroBuilder())
//        println("Hero: $joker")
//}

fun main () {
    val heroBuilder = HeroBuilder()
    val hero = heroBuilder
        .setName("Batman")
        .setAge(30u)
        .build()
    println("Hero: ${hero.power}")
}

