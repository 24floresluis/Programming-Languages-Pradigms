package assign3

import java.time.LocalDate
import java.time.LocalTime

//Feedback: Let's remove all of this
//class MeetingScheduler {
//
//  var name: String? = null
//  var start: LocalTime? = null
//  var end: LocalTime? = null
//  var on: LocalDate? = null
//  var participants: List<String>? = null
//
//  fun schedule(block: MeetingScheduler.() -> Unit): MeetingScheduler = MeetingScheduler().apply(block)
//
//  fun start(time: String) {
//    start = LocalTime.parse(time)
//  }
//
//  fun end(time: String) {
//    end = LocalTime.parse(time)
//  }
//
//  fun on(date: String) {
//    on = LocalDate.parse(date)
//  }
//
//  fun participants(vararg people: String) {
//    participants = listOf(*people)
//  }
//}
                  
//Feedback: let's write minimum code here to make the two tests to pass