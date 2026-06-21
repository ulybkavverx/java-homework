package homeworkautotest.code_tests2.test8;

import homeworkautotest.code_tests2.test8.FindSecondMaxNum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxNumTest {
    private FindSecondMaxNum number;

    @BeforeEach
    void setup() {
        number = new FindSecondMaxNum();
    }

    /**
     * Позитивные кейсы:
     * обычный массив: [3, 5, 7, 2] → findSecondMax() → 5
     * негативные кейсы:
     * Массив с одинаковыми числами: [4, 4, 4, 4] → NoSuchElementException
     * Один элемент: [8] → NoSuchElementException
     * Пустой массив: [] → NoSuchElementException
     */

    @Test
    public void checkPositiveCaseOrdinaryArray() {
        assertEquals(5, number.findSecondMax(new int[]{3, 5, 7, 2}));
    }

    @Test
    public void checkNegativeCaseArrayWithIdenticalNumbers() {
        assertThrows(
                NoSuchElementException.class,
                () -> number.findSecondMax(new int[]{4, 4, 4, 4})
        );
    }

    @Test
    public void checkNegativeCaseArrayWithOneElement() {
        assertThrows(
                IllegalArgumentException.class,
                () -> number.findSecondMax(new int[]{8})
        );
    }

    @Test
    public void checkNegativeCaseEmptyArray() {
        assertThrows(
                IllegalArgumentException.class,
                () -> number.findSecondMax(new int[]{})
        );
    }
}
