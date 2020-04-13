package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {

        val dateFormatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE")
        val date: String = try {
            LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(dateFormatter)
        } catch (E: DateTimeException) {
            "Такого дня не существует"
        }
        return date

    }
}
