package fr.baldir.fizbuzz.app.unit

import fr.baldir.fizzbuzz.app.FizzBuzzApp
import kotlin.test.Test
import kotlin.test.assertEquals

// Test Application behaviour = domain logic orchestration
// given user's interactions
class FizzBuzzAppTest {

    @Test
    fun should_prompt_for_number_when_app_is_launched() {

        val output = mutableListOf<String>()
        val app = given_a_FizzBuzz_app_taking_input(output, mutableListOf("q"))

        when_FizzBuzz_app_is_launched(app)

        assert_FizzBuzz_output_is(output, "Please enter a positive integer:")
    }

    @Test
    fun should_print_1_when_1_is_provided() {

        val output = mutableListOf<String>()
        val app = given_a_FizzBuzz_app_taking_input(output, mutableListOf("1"))

        when_FizzBuzz_app_is_launched(app)

        assert_FizzBuzz_output_is(
            output,
            """Please enter a positive integer:
                |1
            """.trimMargin()
        )
    }

    @Test
    fun should_print_1_then_2_when_2_is_provided() {

        val stdOutContent = mutableListOf<String>()
        val app = given_a_FizzBuzz_app_taking_input(stdOutContent, mutableListOf("2"))

        when_FizzBuzz_app_is_launched(app)

        assert_FizzBuzz_output_is(
            stdOutContent,
            """Please enter a positive integer:
                |1
                |2
            """.trimMargin()
        )
    }

    private fun when_FizzBuzz_app_is_launched(app: FizzBuzzApp) {
        app.launch()
    }

    private fun assert_FizzBuzz_output_is(output: MutableList<String>, expectedOutputLines: String) {
        val actualCliOutput = output.joinToString("\n")
        assertEquals(expectedOutputLines, actualCliOutput)
    }

    private fun given_a_FizzBuzz_app_taking_input(
        output: MutableList<String>,
        inputs: MutableList<String>
    ): FizzBuzzApp {
        return FizzBuzzApp(
            printOutput = { output.add(it) },
            promptInput = { message ->
                output.add(message)
                inputs.removeLast()
            },
            lineSeparator = "\n"
        )
    }
}
