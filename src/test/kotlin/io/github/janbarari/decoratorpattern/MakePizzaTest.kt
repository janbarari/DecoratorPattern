package io.github.janbarari.decoratorpattern

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MakePizzaTest {
    lateinit var pizza: Ingredient

    @BeforeAll
    fun setup() {
        pizza = Dough()
        pizza = HotDog(pizza)
        pizza = Mozarrella(pizza)
        pizza = FrenchSauce(pizza)
        pizza = ChiliSauce(pizza)
    }

    @Test
    fun testCost() {
        assertEquals(7.5, pizza.getCost())
    }

    @Test
    fun testDescription() {
        assertEquals("Dough, Hot-Dog, Mozarrella, French-Sauce, Chili-Sauce", pizza.getDescription())
    }
}