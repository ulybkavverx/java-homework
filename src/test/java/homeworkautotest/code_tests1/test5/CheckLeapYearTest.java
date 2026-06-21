package homeworkautotest.code_tests1.test5;

import homeworkautotest.code_tests1.test5.CheckLeapYear;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckLeapYearTest {
    private CheckLeapYear checkLeapYear;

    @BeforeEach
    void setup() {
        checkLeapYear = new CheckLeapYear();
    }
    /**
     * Позитивные тесты:
     * високосные: 2020, 2000, 1600 -> true
     * граничные случаи:
     * 0, 4, 400 -> true
     * негативные тесты:
     * обычные невисокосные годы: 2021, 2022 -> false
     * года, которые делятся на 100, но не на 400: 1900, 2100 -> false
     * year < 0 -> IllegalArgumentException
     */

    @Test
    public void positiveCasesWhenYearIsLeap() {
        assertTrue(checkLeapYear.isLeapYear(2020));
        assertTrue(checkLeapYear.isLeapYear(2000));
        assertTrue(checkLeapYear.isLeapYear(1600));
    }

    @Test
    public void positiveBoundaryCases() {
        assertTrue(checkLeapYear.isLeapYear(0));
        assertTrue(checkLeapYear.isLeapYear(4));
        assertTrue(checkLeapYear.isLeapYear(400));
    }

    @Test
    public void negativeCasesOrdinaryNotLeapYears() {
        assertFalse(checkLeapYear.isLeapYear(2021));
        assertFalse(checkLeapYear.isLeapYear(2022));
    }
    @Test
    public void yearsThatDivisibleBy100ButNotDivisibleBy400() {
        assertFalse(checkLeapYear.isLeapYear(1900));
        assertFalse(checkLeapYear.isLeapYear(2100));
    }
    @Test
    public void negativeCaseWhenYearLessZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> checkLeapYear.isLeapYear(-1000)
        );
    }
}
