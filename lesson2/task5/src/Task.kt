import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today.addTimeIntervals(YEAR, 2).addTimeIntervals(WEEK, 3).addTimeIntervals(DAY, 5)
     //return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
