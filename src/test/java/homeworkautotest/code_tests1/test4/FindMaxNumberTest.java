package homeworkautotest.code_tests1.test4;

import homeworkautotest.code_tests1.test4.FindMaxNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxNumberTest {
    private FindMaxNumber findMaxNumber;

    @BeforeEach
    void setup() {
        findMaxNumber = new FindMaxNumber();
    }

    /**
     * Позитивные тесты:
     * [3, 5, 7, 2] -> 7
     * [1] -> 1
     * [-3, -5, -7, -2] -> -2
     * негативные тесты:
     * null -> IllegalArgumentException
     * [] -> NoSuchElementException
     */

    @Test
    public void findMaxNumberInPositiveOrdinaryArray() {
        assertEquals(7, findMaxNumber.findMax(new int[]{3, 5, 7, 2}));
    }

    @Test
    public void findNumberOneElementInArray() {
        assertEquals(1, findMaxNumber.findMax(new int[]{1}));
    }

    @Test
    public void findMaxNumberInNegativeNumbersInArray() {
        assertEquals(-2, findMaxNumber.findMax(new int[]{-3, -5, -7, -2}));
    }

    @Test
    public void nullCase() {
        assertThrows(
                NullPointerException.class,
                () -> findMaxNumber.findMax(null)
        );
    }
    @Test
    public void checkEmptyArray() {
        assertThrows(
                NoSuchElementException.class,
                () -> findMaxNumber.findMax(new int[]{})
        );
    }
}
