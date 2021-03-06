package io.github.janbarari.decoratorpattern

fun main(args: Array<String>) {

    val pizza1 = FrenchSauce(HotDog(Mozarrella(Dough())))
    println("Pizza 1\nDescription: ${pizza1.getDescription()}\nCost: ${pizza1.getCost()}$")

}
