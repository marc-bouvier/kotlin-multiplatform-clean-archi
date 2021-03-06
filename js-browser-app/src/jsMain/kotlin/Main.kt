package fr.baldir.fizzbuzz

import fr.baldir.fizzbuzz.app.FizzBuzzApp
import kotlinx.browser.*
import kotlinx.dom.appendText

external val process: dynamic
fun main() {
    // Here we can append a line to a dom element
    val appendLineToOutput: (text: Any) -> Unit = { document.getElementById("root")!!.appendText(it.toString() + "\n") }
    // Here we can wait and read from
    val promptInput: (message: String) -> String = { message -> window.prompt(message)!! }
    val app = FizzBuzzApp(appendLineToOutput, promptInput,"\n")
    // Register as browser global variable
    window.asDynamic()["launch"] = { clear();app.launch() }
    window.asDynamic()["clearOutput"] = ::clear
}

fun clear() {
    document.getElementById("root")!!.innerHTML = ""
}