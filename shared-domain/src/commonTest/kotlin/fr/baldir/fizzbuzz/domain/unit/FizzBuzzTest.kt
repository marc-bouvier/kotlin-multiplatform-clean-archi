package fr.baldir.fizzbuzz.domain.unit

import fr.baldir.fizzbuzz.domain.fizzbuzz
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

// Testing pure domain logic
class FizzBuzzTest {

    @Test
    fun `When 1 then should return 1`() {
        assertEquals("1", fizzbuzz(1))
    }

    @Test
    fun `When 2 then should return 2`() {
        assertEquals("2", fizzbuzz(2))
    }

    @Test
    fun `When 3 then should return Fizz`() {
        assertEquals("Fizz", fizzbuzz(3))
    }

    @Test
    fun `When 6 then should return Fizz`() {
        assertEquals("Fizz", fizzbuzz(6))
    }

    @Test
    fun `When 5 then should return Buzz`() {
        assertEquals("Buzz", fizzbuzz(5))
    }

    @Test
    fun `When 10 then should return Buzz`() {
        assertEquals("Buzz", fizzbuzz(10))
    }

    @Test
    fun `When 15 then should return FizzBuzz`() {
        assertEquals("FizzBuzz", fizzbuzz(15))
    }

    @Test
    fun `When 195 then should return FizzBuzz`() {
        assertEquals("FizzBuzz", fizzbuzz(195))
    }

}