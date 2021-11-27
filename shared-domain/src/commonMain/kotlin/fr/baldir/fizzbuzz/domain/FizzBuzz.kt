package fr.baldir.fizzbuzz.domain

fun fizzbuzz(i: Int): String = if (i % 3 ==0) "Fizz" else if(i == 5 ) "Buzz" else i.toString()