import org.junit.Test

import org.junit.Assert.*

@Suppress("DEPRECATION")
class Task2KtTest {

    @Test
    fun commisionIs_shouldNotAddDiscount() {
        val card = "MasterCard"
        val amount = 850000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

            )

        assertEquals(0.006, result, 0.001)
    }
}