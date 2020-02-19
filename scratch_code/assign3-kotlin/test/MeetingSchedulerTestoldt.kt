package assign3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MeetingSchedulerTest {

    var schedule = MeetingScheduler()

    @Test
    fun canary() {
        assertTrue(true)
    }

    @Test
    fun testCallScheduleMeeting() {
        meeting { }
    }
}