package assign1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NamesComputerTest {

    NamesComputer namesComputer;

    @BeforeEach
    public void setup() {
        namesComputer = new NamesComputer();
    }

    @Test
    public void Canary() {
        assertTrue(true);
    }

    @Test
    public void averageTestEmptyList() {
        assertEquals(0.0, namesComputer.computeAverageLength(List.of()));
    }

    @Test
    public void averageListWithOneName() {
        assertEquals(6.0, namesComputer.computeAverageLength(List.of("Farhan")));
    }

    @Test
    public void averageListWithTwoNamesSameLetterAndLength() {
        assertEquals(4.0, namesComputer.computeAverageLength(List.of("Matt", "Mort")));
    }

    @Test
    public void averageListWithTwoDifferentNameLengths() {
        assertEquals(5.5, namesComputer.computeAverageLength(List.of("Harry", "Joseph")));
    }

    @Test
    public void averageTest() {
        assertEquals(5.0, namesComputer.computeAverageLength(List.of("Alice", "Billy", "Caleb")));
    }

    @Test
    public void averageTestDifferentLengths() {
        assertEquals(5.25, namesComputer.computeAverageLength(List.of("Anh", "Bob", "Joel", "Jennifer", "ReallyExtraLongSuperName", "D", "A", "I", "Alice", "Billy", "Caleb", "Zoe")));
    }

    @Test
    public void noNamesTest() {
        assertTrue(
            namesComputer.computeNamesStartingWithEachLetter(List.of()).isEmpty());
    }

    @Test
    public void oneNameListTest() {
        assertEquals(
            Map.of("B",1), 
            namesComputer.computeNamesStartingWithEachLetter(List.of("Bill")));
    }

    @Test
    public void twoNamesSameLetterAndLengthList() {
        assertEquals(
            Map.of("B", 2), 
            namesComputer.computeNamesStartingWithEachLetter(List.of("Bill", "Burt")));
    }

    @Test
    public void twoNamesDifferentLettersAndLengthsList() {
        assertEquals(
            Map.of("A", 1, "J", 1), 
            namesComputer.computeNamesStartingWithEachLetter(List.of("Alice", "Joe")));
    }

    @Test
    public void numberOfNamesForEachLetterTest() {
        assertEquals(
            Map.of("A", 1, "B", 1, "C", 1), 
            namesComputer.computeNamesStartingWithEachLetter(List.of("Alice", "Billy", "Caleb")));
            
        assertFalse(
            namesComputer.computeNamesStartingWithEachLetter(List.of("Alice", "Billy", "Caleb")).containsKey("D"));
    }

    @Test
    public void testManyNames() {
        assertEquals(
            Map.of("A", 4, "B", 3, "D", 1, "G", 1, "H", 1, "T", 2, "M", 2, "F", 1, "N", 1, "Y", 1), namesComputer.computeNamesStartingWithEachLetter(List.of("Asdf", "Asd", "Asdf", "Afff", "Bbbb", "Bob", "Billy", "Dde", "Guy", "Hello", "Test", "Many", "More", "Fun", "Names", "Thank", "You")));
    }

    @Test
    public void functionalAverageTestEmptyList() {
        assertEquals(0.0, namesComputer.functionalComputeAverageLength(List.of()));
    }

    @Test
    public void functionalAverageListWithOneName() {
        assertEquals(6.0, namesComputer.functionalComputeAverageLength(List.of("Farhan")));
    }

    @Test
    public void functionalAverageListWithTwoNamesSameLetterAndLength() {
        assertEquals(4.0, namesComputer.functionalComputeAverageLength(List.of("Matt", "Mort")));
    }

    @Test
    public void functionalAverageListWithTwoDifferentNameLengths() {
        assertEquals(5.5, namesComputer.functionalComputeAverageLength(List.of("Harry", "Joseph")));
    }

    @Test
    public void functionalAverageTest() {
        assertEquals(5.0, namesComputer.functionalComputeAverageLength(List.of("Alice", "Billy", "Caleb")));
    }
  
    @Test
    public void functionalAverageTestDifferentLengths() {
       assertEquals(5.25, namesComputer.functionalComputeAverageLength(List.of("Anh", "Bob", "Joel", "Jennifer", "ReallyExtraLongSuperName", "D", "A", "I", "Alice", "Billy", "Caleb", "Zoe")));
    }

    @Test
    public void functionalNoNamesTest() {
        assertTrue(
            namesComputer.functionalComputeNamesStartingWithEachLetter(List.of()).isEmpty());
    }

    @Test
    public void functionalOneNameListTest() {
       assertEquals(
           Map.of("B",1L), 
           namesComputer.functionalComputeNamesStartingWithEachLetter(List.of("Bill")));
    }
    @Test
    public void functionalTwoNamesSameLetterAndLengthList() {
       assertEquals(
           Map.of("B", 2L), 
           namesComputer.functionalComputeNamesStartingWithEachLetter(List.of("Bill", "Burt")));
    }

    @Test
    public void functionalTwoNamesDifferentLettersAndLengthsList() {
       assertEquals(
           Map.of("A", 1L, "J", 1L), 
           namesComputer.functionalComputeNamesStartingWithEachLetter(List.of("Alice", "Joe")));
    }

    @Test
    public void functionalNumberOfNamesForEachLetterTest() {
       assertEquals(
           Map.of("A", 1L, "B", 1L, "C", 1L),
           namesComputer.functionalComputeNamesStartingWithEachLetter(List.of("Alice", "Billy", "Caleb")));
    }
   
    @Test
    public void functionalTestManyNames() {
       assertEquals(
           Map.of("A", 4L, "B", 3L, "D", 1L, "G", 1L, "H", 1L, "T", 2L, "M", 2L, "F", 1L, "N", 1L, "Y", 1L), namesComputer.functionalComputeNamesStartingWithEachLetter(List.of("Asdf", "Asd", "Asdf", "Afff", "Bbbb", "Bob", "Billy", "Dde", "Guy", "Hello", "Test", "Many", "More", "Fun", "Names", "Thank", "You")));
    }
}