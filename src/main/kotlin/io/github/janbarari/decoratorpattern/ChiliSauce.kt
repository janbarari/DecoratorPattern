package io.github.janbarari.decoratorpattern

class ChiliSauce(private val decoratedIngredient: Ingredient): Ingredient {
    override fun getDescription(): String {
        return decoratedIngredient.getDescription() + "Chili-Sauce,"
    }

    override fun getCost(): Double {
        return decoratedIngredient.getCost() + 1
    }
}