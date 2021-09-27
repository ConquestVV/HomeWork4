import org.junit.Test

import org.junit.Assert.*

@Suppress("DEPRECATION")
class Task2KtTest {

    @Test
    fun commisionIs_discountForMasterCard() {
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

    @Test
    fun commisionIs_discountForVisa() {
        val card = "Visa"
        val amount = 850000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

        )

        assertEquals(0.0075, result, 0.001)
    }

    @Test
    fun commisionIs_discountForMaestro() {
        val card = "Maestro"
        val amount = 850000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

        )

        assertEquals(0.006, result, 0.001)
    }

    @Test
    fun commisionIs_discountForMir() {
        val card = "MIR"
        val amount = 850000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

        )

        assertEquals(0.0, result, 0.001)
    }

    @Test
    fun commisionIs_discountForMasterCardNotAdded() {
        val card = "MasterCard"
        val amount = 700000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

        )

        assertEquals(0.0, result, 0.001)
    }

    @Test
    fun commisionIs_discountForMaestroNotAdded() {
        val card = "Maestro"
        val amount = 700000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

        )

        assertEquals(0.0, result, 0.001)
    }

    @Test
    fun commisionIs_discountForVisaNotAdded() {
        val card = "Visa"
        val amount = 700000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

        )

        assertEquals(0.0075, result, 0.001)
    }

    @Test
    fun commisionIs_discountForMirNotAdded() {
        val card = "MIR"
        val amount = 700000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

        )

        assertEquals(0.0075, result, 0.001)
    }

    @Test
    fun commisionIs_discountForVkPayNotAdded() {
        val card = "VKPay"
        val amount = 700000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

        )

        assertEquals(0.0, result, 0.001)
    }

    @Test
    fun commisionIs_discountForVkPay() {
        val card = "VKPay"
        val amount = 850000.0
        val maxValue = 750000.0

        val result = commisionIs(
            typeCard = card,
            amount = amount,
            maxValue = maxValue

        )

        assertEquals(0.0, result, 0.001)
    }
}