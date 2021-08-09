package apitestcucumber

import io.cucumber.java8.En
import org.junit.Assert

class StepDefinitions : En {
    private var today: String? = null
    private var actualAnswer: String? = null
    init {
        Given("today is Sunday") {
            today = "Sunday"
        }
        When("I ask whether it's Friday yet"){
            actualAnswer = IsItFriday.isItFriday(today)
        }

        Then("I should be told {string}"){expectedAnswer: String ->
            Assert.assertEquals(expectedAnswer, actualAnswer)
        }
    }
}

internal object IsItFriday {
    fun isItFriday(today: String?): String {
        return "Nope"
    }
}