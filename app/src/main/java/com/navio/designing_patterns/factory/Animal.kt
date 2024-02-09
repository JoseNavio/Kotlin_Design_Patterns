package com.navio.designing_patterns.factory

/** We use the factory pattern to create objects without exposing the instantiation logic to the client.
 *
 * The parent class contains common methods that must be implemented by the child classes.
 * */
abstract class Animal {
    abstract fun makeSound(): String
}

//The same can be achieved using an interface
//interface Animal {
//    fun makeSound(): String
//}