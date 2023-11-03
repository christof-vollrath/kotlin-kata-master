import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class DescribeTestExample : DescribeSpec({
    describe("adding") {
        describe("two numbers") {
            val a = 1
            val b = 2
            it("adds them") {
                val result = a + b
                result shouldBe 3
            }
        }
    }
})