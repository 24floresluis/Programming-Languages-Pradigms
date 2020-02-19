import src.MeetingScheduler

schedule = new MeetingScheduler()

def printInfo(MeetingScheduler schedule) {
  println "\nMeeting Details:"
  println "----------------"
  println "Name:            " + schedule.meetingInfo.name
  println "Start Time:      " + schedule.meetingInfo.start
  println "End Time:        " + schedule.meetingInfo.end
  println "Duration:        " + schedule.duration()
  println "Date:            " + schedule.meetingInfo.date
  println "Total Attendees: " + schedule.meetingInfo.participants.size()
  println "Attending:       "
  schedule.meetingInfo.participants.each {it ->  println "                 " + it + " "}
}

schedule.meeting {
  name 'Meet the Millers'
  start 9:30
  end 11:30
  on 8 25 2018
  participants 'Mr. Miller', 'Mrs. Miller', 'Tommy Miller'
}

printInfo(schedule)

schedule.meeting {
  name 'Watch Programming Languages Lectures'
  start 13:30
  end 14:45
  on 10 19 2018
  participants 'Luis Flores', 'Diego Perez'
}

printInfo(schedule)