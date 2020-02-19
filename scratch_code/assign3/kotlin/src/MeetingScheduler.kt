package assign3

import java.time.*
import java.time.format.DateTimeFormatter

class Meeting {
  var meeting = this
  var starts = this
  var and = this
  var on = this
  var participants = this
  var name: String = ""
  var startTime: String = ""
  var endTime: String = ""
  var meetingParticipants: List<String> = listOf()

  var meetingDate: String = ""
  var month: String = ""
  var day: Int = 0
  var year: Int = 0

  var January: String = "January"
  var February: String = "February"
  var March: String = "March"
  var April: String = "April"
  var May: String = "May"
  var June: String = "June"
  var July: String = "July"
  var August: String = "August"
  var September: String = "September"
  var October: String = "October"
  var November: String = "November"
  var December: String = "December"
  
  infix fun include(people: String) {
    meetingParticipants = people.split(".").map { "$it." }.dropLast(1)
  }

  fun duration(): String {
    var start = parseTime(startTime)
    var end = parseTime(endTime)
    return Duration.between(start, end).toMinutes().toString()
  }

  fun parseTime(time: String): LocalTime {
    return LocalTime.parse(time, DateTimeFormatter.ofPattern("H:mm"))
  }

  infix fun name(value: String) {
    name = value
  }

  infix fun at(time: IntRange) {
    startTime = time.toString().replace("..", ":")
  }

  infix fun ends(time: IntRange) {
    endTime = time.toString().replace("..", ":")
  }

  infix fun th(month: String): Meeting {
    this.month = month
    return this
  }

  infix fun the(day: Int): Meeting {
    this.day = day
    return this
  }

  infix fun of(year: Int): Meeting {
    meetingDate = "$month $day, $year"
    return this
  }
}

object schedule {
  infix fun meeting(block: Meeting.() -> Unit): Meeting {
    return Meeting().apply(block)
  }
}