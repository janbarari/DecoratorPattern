package io.github.janbarari.decoratorpattern

class HotDog(private val decoratedIngredient: Ingredient): Ingredient {
    override fun getDescription(): String {
        return decoratedIngredient.getDescription() + "Hot-Dog, "
    }

    override fun getCost(): Double {
        return 1.33
    }
}