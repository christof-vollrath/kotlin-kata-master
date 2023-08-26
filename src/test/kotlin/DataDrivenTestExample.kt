import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class DataDrivenTestExample: FunSpec() { init{
    withData(
        Triple(1, 2, 3),
        Triple(10, 30, 40),
    ) { (a, b, expected) ->
        a + b shouldBe expected
    }

} }
