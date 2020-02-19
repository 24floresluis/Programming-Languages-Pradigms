import org.junit.jupiter.api.Test;
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SampleTest {
  @Test fun canary() {
     assertTrue(true)
  }

  @Test fun addTwo() {
     assertEquals(3, Sample().add(1, 2))
  }
}