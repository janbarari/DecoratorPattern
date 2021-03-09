package io.github.janbarari.decoratorpattern

class Mozarrella(private val decoratedIngredient: Ingredient) : Ingredient {
    override fun getDescription(): String =
        "${decoratedIngredient.getDescription()}, Mozarrella"

    override fun getCost(): Double =
        decoratedIngredient.getCost() + 1.5
}