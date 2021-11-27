package fr.baldir.fizzbuzz.domain

fun fizzbuzz(i: Int): String = when {
    i % 3 ==0 -> "Fizz"
    i % 5 ==0 -> "Buzz"
    else -> i.toString()
}