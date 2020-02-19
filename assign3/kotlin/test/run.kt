package assign3

fun main(args: Array<String>) {

  println("Called..")
  fun printInfo(Meeting schedule) {
    println ("\nMeeting Details:")
    println ("----------------")
    println ("Name:            " + schedule.name)
    println ("Start Time:      " + schedule.startTime)
    println ("End Time:        " + schedule.endTime)
  //   println ("Duration:        " + schedule.duration())
    println ("Date:            " + schedule.meetingDate)
  //   println ("Total Attendees: " + schedule.meetingInfo.participants.size())
  //   println ("Attending:       ")
  //   schedule.meetingInfo.participants.each {it ->  println "                 " + it + " "}
  }

  val result = schedule meeting {
    meeting name "Meet the Millers"
    starts at 9..30
    and ends 11..30
    on the 25 th August of 2018
   }


  printInfo(result)

  // val result = schedule meeting {
  //       meeting name "Watch Programming Languages Lectures"
  //       starts at 13..30
  //       and ends 14..45
  //       on the 19 th October of 2018
  // }

  // printInfo(result)
}