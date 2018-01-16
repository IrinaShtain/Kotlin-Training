class DateRange(private val start: MyDate, private val endInclusive: MyDate) {
    operator fun contains(d: MyDate) = d in start..endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
