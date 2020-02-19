package assign3

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals

class MeetingSchedulerTest {

  @Test
  fun canary() {
    assertTrue(true)
  }

  @Test
  fun testCallScheduleMeetingTraditional() {
    val result = schedule.meeting({})

    assertTrue(result.hashCode() > 0)
  }

  @Test
  fun testCallScheduleMeetingFluent() {
    val result = schedule meeting {}

    assertTrue(result.hashCode() > 0)
  }

  @Test
  fun testCallScheduleMeetingName() {
    val result = schedule meeting {

      meeting name "early admissions"
    }

    assertEquals("early admissions", result.name)
  }

  @Test
  fun testCallScheduleStartTime() {
    val result = schedule meeting {

      meeting name "early admissions"
      starts at 14..30
    }

    assertEquals("early admissions", result.name)
    assertEquals("14:30", result.startTime)
  }

  @Test
  fun testCallScheduleEndTime() {
    val result = schedule meeting {

      meeting name "early admissions"
      starts at 14..30
      and ends 15..30
    }

    assertEquals("early admissions", result.name)
    assertEquals("14:30", result.startTime)
    assertEquals("15:30", result.endTime)
  }

  @Test
  fun testCallScheduleMeetingDate() {
    val result = schedule meeting {

      meeting name "early admissions"
      starts at 14..30
      and ends 15..30
      on the 10 th October of 2018
    }

    assertEquals("early admissions", result.name)
    assertEquals("14:30", result.startTime)
    assertEquals("15:30", result.endTime)
    assertEquals("October 10, 2018", result.meetingDate)
  }

  @Test
  fun testCallScheduleMeetingParticipants() {
    val result = schedule meeting {

      meeting name "early admissions"
      starts at 14..30
      and ends 15..30
      on the 10 th October of 2018
      participants include "Amy A." + "Bruce B." + "Chin C."
    }

    assertEquals("early admissions", result.name)
    assertEquals("14:30", result.startTime)
    assertEquals("15:30", result.endTime)
    assertEquals("October 10, 2018", result.meetingDate)
    assertEquals(listOf("Amy A.", "Bruce B.", "Chin C."), result.meetingParticipants)
  }
}