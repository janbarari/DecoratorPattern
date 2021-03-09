package io.github.janbarari.decoratorpattern

class HotDog(private val decoratedIngredient: Ingredient) : Ingredient {
    override fun getDescription(): String =
        "${decoratedIngredient.getDescription()}, Hot-Dog"

    override fun getCost(): Double =
        decoratedIngredient.getCost() + 3.0
}