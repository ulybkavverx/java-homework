package homeworkautotest.code_tests3.test14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAvgArrayNumTest {
    private FindAvgArrayNum avg;

    @BeforeEach
    void setup() {
        avg = new FindAvgArrayNum();
    }

    /**
     * [1, 2, 3, 4, 5] → 3.0
     * [10] → 10.0
     * [] -> NoSuchElementException
     */

    @Test
    public void checkRegularNumbersInArray() {
        assertEquals(
                3.0,
                avg.findAverage(new int[]{1, 2, 3, 4, 5})
        );
    }

    @Test
    public void arrayWithOneElement() {
        assertEquals(
                10.0,
                avg.findAverage(new int[]{10})
        );
    }
    @Test
    public void emptyArray() {
        assertThrows(
                NoSuchElementException.class,
                () -> avg.findAverage(new int[]{})
        );
    }

}
