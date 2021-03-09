package io.github.janbarari.decoratorpattern

object PizzaDecorator {
	fun main() {
		lateinit var pizza: Ingredient

		pizza = Dough()
		pizza = HotDog(pizza)
		pizza = Mozarrella(pizza)
		pizza = FrenchSauce(pizza)
		pizza = ChiliSauce(pizza)

		println("Pizza\nDescription: ${pizza.getDescription()}\nCost: $${pizza.getCost()}")
	}
}