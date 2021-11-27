package fr.baldir.fizbuzz.app.unit

import fr.baldir.fizzbuzz.app.FizzBuzzApp
import kotlin.test.Test
import kotlin.test.assertEquals

// Test Application behaviour = domain logic orchestration
// given user's interactions
class FizzBuzzAppTest {

    // IO is mocked
    @Test
    fun should_prompt_for_number_when_app_is_launched() {

        // Test dependencies
        val stdOutContent = mutableListOf<String>()
        val printOutput: (text: Any) -> Unit = { stdOutContent.add(it.toString()) }
        val stdIntInputs = mutableListOf("q")
        val promptInput: (message: String) -> String = { message ->
            printOutput(message)
            stdIntInputs.removeLast()
        }

        val app = FizzBuzzApp(printOutput, promptInput, "\n")
        app.launch()

        // Should prompt for a number
        val actualCliOutput = stdOutContent.joinToString("\n")
        assertEquals("Please enter a positive integer:", actualCliOutput)
    }

    @Test
    fun should_print_1_when_1_is_provided() {

        // Test dependencies
        val stdOutContent = mutableListOf<String>()
        val printOutput: (text: Any) -> Unit = { stdOutContent.add(it.toString()) }
        val stdIntInputs = mutableListOf("1")
        val promptInput: (message: String) -> String = { message ->
            printOutput(message)
            stdIntInputs.removeLast()
        }

        val app = FizzBuzzApp(printOutput, promptInput, "\n")
        app.launch()

        // Should prompt for a number
        val actualCliOutput = stdOutContent.joinToString("\n")
        assertEquals(
            """Please enter a positive integer:
                |1
            """.trimMargin(),
            actualCliOutput
        )
    }

    @Test
    fun should_print_1_then_2_when_2_is_provided() {

        // Test dependencies
        val stdOutContent = mutableListOf<String>()
        val printOutput: (text: Any) -> Unit = { stdOutContent.add(it.toString()) }
        val stdIntInputs = mutableListOf("2")
        val promptInput: (message: String) -> String = { message ->
            printOutput(message)
            stdIntInputs.removeLast()
        }

        val app = FizzBuzzApp(printOutput, promptInput, "\n")
        app.launch()

        // Should prompt for a number
        val actualCliOutput = stdOutContent.joinToString("\n")
        assertEquals(
            """Please enter a positive integer:
                |1
                |2
            """.trimMargin(),
            actualCliOutput
        )
    }
}