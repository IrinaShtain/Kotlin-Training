data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return when {
            this.year.compareTo(other.year) != 0 -> this.year.compareTo(other.year)
            this.year.compareTo(other.year) != 0 -> this.month.compareTo(other.month)
            else -> this.dayOfMonth.compareTo(other.dayOfMonth)
        }
    }

}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
