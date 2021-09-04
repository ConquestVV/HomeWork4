fun main() {
    val amount = 800000.0
    val maxValue = 750000.0
    val typeCard = "VK Pay"
    val summTransfer = 0.0
    val totalCommission = commisionIs(amount, maxValue, typeCard)

    val maxTransferValue =
        when (typeCard) {
            "VK Pay" -> 40_000_00.0
            else -> 600_000_00.0
        }

    if (amount > maxTransferValue || amount + summTransfer >= maxTransferValue) {
        println("Ischerpan limit")
    } else {
        summTransfer == summTransfer + amount

        val result = amount + amount * totalCommission

        println("Summa perevoda: $result kopeek")
        println("V etom mesyace pereveli: $summTransfer kopeek")
        println("Kommissiya sostavila: $totalCommission kopeek")
    }
}

fun commisionIs(amount: Double, maxValue: Double, typeCard: String): Double {

    val totalCommission = if (amount <= maxValue) {
        when (typeCard) {
            "MasterCard" -> 0.0
            "Maestro" -> 0.0
            "Visa" -> 0.0075
            "MIR" -> 0.0075
            else -> 0.0
        }
    } else
        when (typeCard) {
            "MasterCard" -> 0.006
            "Maestro" -> 0.006
            "Visa" -> 0.0075
            "MIR" -> 0.0075
            else -> 0.0
        }
    return totalCommission
}