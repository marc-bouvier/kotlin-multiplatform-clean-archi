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
}