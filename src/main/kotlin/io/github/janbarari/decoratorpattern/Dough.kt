package io.github.janbarari.decoratorpattern

class Dough : Ingredient {
    override fun getDescription(): String =
        "Dough"

    override fun getCost(): Double =
        1.0
}