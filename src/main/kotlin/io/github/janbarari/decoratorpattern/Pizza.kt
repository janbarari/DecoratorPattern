package io.github.janbarari.decoratorpattern

fun main() {

    lateinit var pizza: Ingredient

    pizza = Dough()
    pizza = HotDog(pizza)
    pizza = Mozarrella(pizza)
    pizza = FrenchSauce(pizza)
    pizza = ChiliSauce(pizza)

    val ingredients = pizza.getDescription().split(",").filter { it.trim().isNotEmpty() }

    println("Pizza\nDescription: ${ingredients}\nCost: $${pizza.getCost()}")

}
