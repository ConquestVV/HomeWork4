fun main() {
    val wasOnline = 100000000

    val time = secondsConverter(wasOnline)

    val message = messageConverter(time, wasOnline)

    val messageOnlineStatus = agoToText(time, message, wasOnline)
    println(messageOnlineStatus)
}

fun messageConverter(time: Int, wasOnline: Int): String {
    val cost = time % 10
    val message = if (wasOnline >= 60 * 60 && wasOnline < 24 * 60 * 60)
        when (cost) {
            1 -> "chas"
            in 2..4 -> "chasa"
            else -> "chasov"
        } else
        when (cost) {
            1 -> "minutu"
            in 2..4 -> "minuty"
            else -> "minut"
        }
    return message
}

fun secondsConverter(wasOnline: Int): Int {
    val time = if (wasOnline >= 60 && wasOnline < 60 * 60)
        wasOnline / 60 else if (wasOnline >= 60 * 60 && wasOnline < 24 * 60 * 60)
        wasOnline / 3600 else wasOnline
    return time
}

fun agoToText(
    time: Int, message: String, wasOnline: Int
): String {
    val messageOnlineStatus =
        when (wasOnline) {
            in 0..60 -> "byl(a) v seti tol'ko chto"
            in 61..60 * 60 -> "byl(a) v seti $time $message nazad"
            in 60 * 60 + 1..24 * 60 * 60 -> "byl(a) v seti $time $message nazad"
            in 24 * 60 * 60 + 1..48 * 60 * 60 -> "byl(a) v seti segodnya"
            in 48 * 60 * 60 + 1..72 * 60 * 60 -> "byl(a) v seti vchera"
            else -> "byl(a) v seti davno"
        }
    return messageOnlineStatus
}

