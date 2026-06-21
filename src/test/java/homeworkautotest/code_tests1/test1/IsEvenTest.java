package homeworkautotest.code_tests1.test1;

import homeworkautotest.code_tests1.test1.ParityCheck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest {
    private ParityCheck parityCheck;

    @BeforeEach
    void setup() {
        parityCheck = new ParityCheck();
    }

    /**
     * позитивные кейсы:
     * четные положительные числа (2, 4)
     * четные отрицательные числа (-2, -4)
     * нулевое значение (0)
     * <p>
     * негативные кейсы:
     * нечетные положительные числа (1, 3)
     * нечетные отрицательные числа (-1, -3)
     */
    @Test
    public void checkingPositiveEvenNumbers() {
        assertTrue(parityCheck.isEven(2));
    }

    @Test
    public void checkingNegativeEvenNumbers() {
        assertTrue(parityCheck.isEven(-2));
    }

    @Test
    public void checkingZero() {
        assertTrue(parityCheck.isEven(0));
    }

    @Test
    public void checkingPositiveOddNumbers() {
        assertFalse(parityCheck.isEven(1));
    }

    @Test
    public void checkingNegativeOddNumbers() {
        assertFalse(parityCheck.isEven(-1));
    }
}
