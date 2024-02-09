package com.navio.designing_patterns.builder

interface HeroInterface {
    fun setName(name: String): HeroBuilder
    fun setAge(age: UInt): HeroBuilder
    fun setWeakness(weakness: String): HeroBuilder
    fun setPower(power: String): HeroBuilder
    fun setIsVillain(isVillain: Boolean): HeroBuilder
    fun build(): Hero
}