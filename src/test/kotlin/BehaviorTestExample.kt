import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class BehaviorTestExample: BehaviorSpec() { init {
    Given("two numbers") {
        val a = 1
        val b = 2
        When("adding these numbers") {
            val result = a + b
            Then("the result should be 3") {
                result shouldBe 3
            }
        }
    }
} }
