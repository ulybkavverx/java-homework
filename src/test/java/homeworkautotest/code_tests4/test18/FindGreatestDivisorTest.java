package homeworkautotest.code_tests4.test18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindGreatestDivisorTest {
    private FindGreatestDivisor divisor;

    @BeforeEach
    void setup() {
        divisor = new FindGreatestDivisor();
    }

    /**
     * 24, 36 → 12
     * 101, 103 → 1
     * 0, 10 → 10
     */

    @Test
    public void checkOrdinaryNumbers() {
        assertEquals(12, divisor.gcd(24, 36));
    }

    @Test
    public void checkSimpleNumbers() {
        assertEquals(1, divisor.gcd(101, 103));
    }

    @Test
    public void checkZeroValue() {
        assertEquals(10, divisor.gcd(0, 10));
    }
}
