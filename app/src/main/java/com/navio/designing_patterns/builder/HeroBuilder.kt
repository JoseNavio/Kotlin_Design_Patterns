package com.navio.designing_patterns.builder

/** We use the builder pattern when we want to create an object that has many properties and we want
 *  to set only a few of them. */
class HeroBuilder: HeroInterface {

    private var name: String? = null
    private var age: UInt? = null
    private var weakness: String? = null
    private var power: String? = null
    private var isVillain: Boolean? = null

    override fun setName(name: String): HeroBuilder {
        this.name = name
        return this
    }

    override fun setAge(age: UInt): HeroBuilder {
        this.age = age
        return this
    }

    override fun setWeakness(weakness: String): HeroBuilder {
        this.weakness = weakness
        return this
    }

    override fun setPower(power: String): HeroBuilder {
        this.power = power
        return this
    }

    override fun setIsVillain(isVillain: Boolean): HeroBuilder {
        this.isVillain = isVillain
        return this
    }

    override fun build(): Hero {
        return Hero(
            name = name,
            age = age,
            weakness = weakness,
            power = power,
            isVillain = isVillain
        )
    }
}