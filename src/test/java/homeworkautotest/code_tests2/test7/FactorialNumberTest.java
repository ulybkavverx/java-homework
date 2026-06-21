package homeworkautotest.code_tests2.test7;

import homeworkautotest.code_tests2.test7.FactorialNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialNumberTest {
    private FactorialNumber number;

    @BeforeEach
    void setup() {
        number = new FactorialNumber();
    }

    /**
     * Позитивные кейсы:
     * базовый случай: factorial(0) -> 1
     * обычные числа: factorial(1) → 1, factorial(5) → 120, factorial(7) → 5040
     * негативные кейсы:
     * отрицательные числа: factorial(-3) → IllegalArgumentException
     */
    @Test
    public void baseCaseFactorialIsZero() {
        assertEquals(1, number.factorial(0));
    }
    @Test
    public void ordinaryNumbers() {
        assertEquals(1, number.factorial(1));
        assertEquals(120, number.factorial(5));
        assertEquals(5040, number.factorial(7));
    }
    @Test
    public void negativeNumbers() {
        assertThrows(
                IllegalArgumentException.class,
                () -> number.factorial(-3)
        );
    }
}
