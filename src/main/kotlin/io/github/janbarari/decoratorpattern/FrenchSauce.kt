package io.github.janbarari.decoratorpattern

class FrenchSauce(private val decoratedIngredient: Ingredient) : Ingredient {
    override fun getDescription(): String =
        "${decoratedIngredient.getDescription()}, French-Sauce"

    override fun getCost(): Double =
        decoratedIngredient.getCost() + 1.0
}