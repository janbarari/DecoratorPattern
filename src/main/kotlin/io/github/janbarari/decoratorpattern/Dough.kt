package io.github.janbarari.decoratorpattern

class Dough: Ingredient {
    override fun getDescription(): String {
        return "Dough,"
    }

    override fun getCost(): Double {
        return 1.0
    }
}