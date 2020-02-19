package assign3

fun main(args: Array<String>) {

  fun printInfo(schedule: Meeting) {
    println ("\nMeeting Details:")
    println ("----------------")
    println ("Name:            " + schedule.name)
    println ("Start Time:      " + schedule.startTime)
    println ("End Time:        " + schedule.endTime)
    println ("Duration:        " + schedule.duration() + " minutes")
    println ("Date:            " + schedule.meetingDate)
    println ("Total Attendees: " + schedule.meetingParticipants.size)
    println ("Attending:       ")
    for(element in schedule.meetingParticipants)
        println ("                 $element")
  }

  var result = schedule meeting {
    meeting name "Meet the Millers"
    starts at 9..30
    and ends 11..30
    on the 25 th August of 2018
    participants include "Amy A." + "Bruce B." + "Chin C."
  }

  printInfo(result)

  result = schedule meeting {
    meeting name "Watch Programming Languages Lectures"
    starts at 13..30
    and ends 14..45
    on the 19 th October of 2018
    participants include "Luis F." + "Diego P."
  }

  printInfo(result)
}