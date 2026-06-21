package homeworkautotest.code_tests1.test2;

import homeworkautotest.code_tests1.test2.CountNumberVowels;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class NumberOfVowelTest {
    private CountNumberVowels counter;

    @BeforeEach
    void setup() {
        counter = new CountNumberVowels();
    }
    /**
     * позитивные тесты:
     * "hello" -> 2
     * "java" -> 2
     * "AEIOU" -> 5
     * "" -> 0
     *
     * негативные тесты:
     * null -> IllegalArgumentException
     * "ptsrk" -> 0
     */

    @Test
    public void verificationOfPositiveCases() {
        assertEquals(2, counter.countVowels("hello"));
        assertEquals(2, counter.countVowels("java"));
        assertEquals(5, counter.countVowels("AEIOU"));
        assertEquals(0, counter.countVowels(""));
    }

    @Test
    public void stringWithoutVowels() {
        assertEquals(0, counter.countVowels("ptsrk"));
    }

    @Test
    public void nullCase() {
        assertThrows(
                IllegalArgumentException.class,
                () -> counter.countVowels(null)
        );
    }
}
