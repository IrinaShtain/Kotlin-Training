data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) {
//    operator fun component1(): Int {
//        return year
//    }
//
//    operator fun component2(): Int {
//        return month
//    }
//
//    operator fun component3(): Int {
//        return dayOfMonth
//    }
}

fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}
