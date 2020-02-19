package src

import java.text.*
import java.util.*
import groovy.time.*

class MeetingScheduler {

  def meetingInfo = [:]

  def duration() {
    def start = Date.parse("HH:mm", meetingInfo.start)
    def end = Date.parse("HH:mm", meetingInfo.end)
    return TimeCategory.minus(end, start)
  }

  def meeting(closure) {
    this.with(closure)
    this
  }

  def name(String meetingName) { 
    meetingInfo.name = meetingName
  }

  def formatTime(Map time) {
    time.keySet().collect { key -> "$key:${time[key]}"}.join("")
  }

  def start(Map time) { 
    meetingInfo.start = formatTime(time)
  }

  def end(Map time) {
    meetingInfo.end = formatTime(time)
  }

  def on(month) {
    meetingInfo.month = new DateFormatSymbols().getMonths()[month-1]
    this
  }

  def participants(String... participants) {
    meetingInfo.participants = participants
  }

  def methodMissing(String name, args) {
    meetingInfo.day = name.toInteger()
    meetingInfo.year = args[0]
    meetingInfo.date = "$meetingInfo.month $meetingInfo.day, $meetingInfo.year"
  }

}
