package assign3

class MeetingScheduler {
    var meetingInfo = mutableMapOf<String, String>()
    infix fun name(meetingName: String) {
        meetingInfo.put("name", meetingName)
    }
}

fun meeting(block: MeetingScheduler.() -> Unit) {
    block(MeetingScheduler())
}