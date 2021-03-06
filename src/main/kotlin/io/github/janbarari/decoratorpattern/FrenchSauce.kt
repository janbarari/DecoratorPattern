package io.github.janbarari.decoratorpattern

class FrenchSauce(private val decoratedIngredient: Ingredient): Ingredient {
    override fun getDescription(): String {
        return decoratedIngredient.getDescription() + "French-Sauce, "
    }

    override fun getCost(): Double {
        return 0.56
    }
}