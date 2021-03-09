package io.github.janbarari.decoratorpattern

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Test

class AppTest {
    @Test
    fun shouldExecuteApplicationWithoutException() {
        assertDoesNotThrow { PizzaDecorator.main() }
    }
}