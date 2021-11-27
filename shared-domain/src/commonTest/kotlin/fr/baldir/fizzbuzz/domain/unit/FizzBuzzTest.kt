package fr.baldir.fizzbuzz.domain.unit

import fr.baldir.fizzbuzz.domain.fizzbuzz
import kotlin.test.Test
import kotlin.test.assertEquals

// Testing pure domain logic
class FizzBuzzTest {

    @Test
    fun when_1_then_should_return_1() {
        assertEquals("1", fizzbuzz(1))
    }

    @Test
    fun when_2_then_should_return_2() {
        assertEquals("2", fizzbuzz(2))
    }

    @Test
    fun when_3_then_should_return_Fizz() {
        assertEquals("Fizz", fizzbuzz(3))
    }

    @Test
    fun when_6_then_should_return_Fizz() {
        assertEquals("Fizz", fizzbuzz(6))
    }

    @Test
    fun when_5_then_should_return_Buzz() {
        assertEquals("Buzz", fizzbuzz(5))
    }

    @Test
    fun when_10_then_should_return_Buzz() {
        assertEquals("Buzz", fizzbuzz(10))
    }

    @Test
    fun when_15_then_should_return_FizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzz(15))
    }

    @Test
    fun when_195_then_should_return_FizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzz(195))
    }

}