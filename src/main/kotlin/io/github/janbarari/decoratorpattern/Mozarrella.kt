package io.github.janbarari.decoratorpattern

class Mozarrella(private val decoratedIngredient: Ingredient): Ingredient {

    override fun getDescription(): String {
        return decoratedIngredient.getDescription() + "Mozarrella,"
    }

    override fun getCost(): Double {
        return decoratedIngredient.getCost() + 1.5
    }
}