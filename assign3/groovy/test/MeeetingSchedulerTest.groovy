import src.MeetingScheduler
import spock.lang.*

class MeetingSchedulerTest extends Specification {

  def schedule

  def setup() {
    schedule = new MeetingScheduler()
  }

  def "canary"() {
    expect:
      true
  }

  def "test call schedule meeting"() {
    expect:
      schedule.meeting {}
  }

  def "test set meeting name"() {
    def scheduledMeeting = schedule.meeting {
      name 'early admissions'
    }                        
    
    expect:
      scheduledMeeting.meetingInfo.name == 'early admissions'
  }

  def "test set meeting start time"() {
    def scheduledMeeting = schedule.meeting {
      name 'early admissions'
      start 14:30
    }

    expect:
      scheduledMeeting.meetingInfo.name == 'early admissions'
      scheduledMeeting.meetingInfo['start'] == '14:30'
  }

  def "test set meeting end time"() {
    def scheduledMeeting = schedule.meeting {
      name 'early admissions'
      start 14:30
      end 15:30
    }

    expect:
      scheduledMeeting.meetingInfo.name == 'early admissions'
      scheduledMeeting.meetingInfo['start'] == '14:30'
      scheduledMeeting.meetingInfo['end'] == '15:30'
  }

  def "test set meeting date"() {
    def scheduledMeeting = schedule.meeting {
      name 'early admissions'
      start 14:30
      end 15:30
      on 10 15 2018
    }

    expect:
      scheduledMeeting.meetingInfo.name == 'early admissions'
      scheduledMeeting.meetingInfo['start'] == '14:30'
      scheduledMeeting.meetingInfo['end'] == '15:30'
      scheduledMeeting.meetingInfo['date'] == "October 15, 2018"
  }

  def "test set meeting members"() {
    def scheduledMeeting = schedule.meeting {
      name 'early admissions'
      start 14:30
      end 15:30
      on 10 15 2018
      participants 'Kim R.', 'Mike B.', 'Paula P.', 'Chin Z.'
    }

    expect:
      scheduledMeeting.meetingInfo.name == 'early admissions'
      scheduledMeeting.meetingInfo['start'] == '14:30'
      scheduledMeeting.meetingInfo['end'] == '15:30'
      scheduledMeeting.meetingInfo['date'] == "October 15, 2018"
      schedule.meetingInfo['participants'] == ['Kim R.', 'Mike B.', 'Paula P.', 'Chin Z.'] 
  }
}

