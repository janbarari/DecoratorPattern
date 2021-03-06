package io.github.janbarari.decoratorpattern

object PizaaDecorator {

    @JvmStatic
    fun main(args: Array<String>) {

        lateinit var pizza: Ingredient

        pizza = Dough()
        pizza = HotDog(pizza)
        pizza = Mozarrella(pizza)
        pizza = FrenchSauce(pizza)
        pizza = ChiliSauce(pizza)

        println("Pizza\nDescription: ${pizza.getDescription()}\nCost: $${pizza.getCost()}")

    }

}
