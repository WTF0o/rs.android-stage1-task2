package subtask2

import java.time.LocalTime
import java.time.format.DateTimeFormatter
import javax.swing.text.DateFormatter

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {

        val h = hour.toInt()
        val m = minute.toInt()

        if (m <= 60) {

            val strTime = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
                "twenty-one","twenty two")

            when{

                m == 0 -> return "${strTime[h]} o' clock"
                m == 15 -> return "quarter past ${strTime[h]}"
                m == 30 -> return "half past ${strTime[h]}"
                m == 45 -> return "quarter to ${strTime[h+1]}"
                m in 1..29 -> return "${strTime[m]} minutes past ${strTime[h]}"
                m > 30 -> return "${strTime[60 - m]} minutes to ${strTime[h+1]}"

            }
        }

        return ""

    }
}
