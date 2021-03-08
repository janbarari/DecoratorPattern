package io.github.janbarari.decoratorpattern

class ChiliSauce(private val decoratedIngredient: Ingredient) : Ingredient {
    override fun getDescription(): String =
        "${decoratedIngredient.getDescription()}, Chili-Sauce"

    override fun getCost(): Double =
        decoratedIngredient.getCost() + 1
}