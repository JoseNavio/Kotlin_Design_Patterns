package com.navio.designing_patterns.singleton

//We use the singleton pattern when we want to create an object that can only have one instance.
class Singleton private constructor() {

    var name: String = ""

    companion object {

        val instance: Singleton by lazy {
            Singleton()
        }

//        private val instance: Config by lazy {
//            Config()
//        }

//        //This function in Kotlin is used to allow instances of a class to be invoked as if they were functions.
//        operator fun invoke(): Config {
//            return instance
//        }
    }
}

//An object declaration is a way to define a singleton in Kotlin, it's equivalent to the Java's static keyword.
object ObjectConfig {

    var name: String = ""

}

//fun main() {
//    //It's equivalent to calling Config.invoke().
//    val config = Config()
//    config.name = "Navio"
//    val config2 = Config()
//    config2.name = "Mendoza"
//    println(config.name)
//}

//fun main() {
//    val config = Config.instance
//    config.name = "Navio"
//    val config2 = Config.instance
//    config2.name = "Mendoza"
//    println(config.name)
//}

fun main() {
    ObjectConfig.name = "Navio"
    ObjectConfig.name = "Mendoza"
    println(ObjectConfig.name)
}