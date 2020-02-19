package assign1;

import spock.lang.Specification

class SampleTest extends Specification {

    Sample sample;

    void setup() {
        sample = new Sample()
    }

    void 'test Canary'() {
        expect:
          true == true
    }

    void 'add two numbers'() {
      expect:
        3 == sample.add(1, 2)
    }
}
