package homeworkautotest.code_tests4.test20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckingHasDuplicatesTest {
    private CheckingHasDuplicates duplicate;

    @BeforeEach
    void setup() {
        duplicate = new CheckingHasDuplicates();
    }

    /**
     * [1, 2, 3, 4, 5] → false
     * [1, 2, 2, 3] → true
     * [] → false
     */
    @Test
    public void arrayWithoutDuplicates() {
        assertFalse(duplicate.hasDuplicates(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void arrayWithDuplicates() {
        assertTrue(duplicate.hasDuplicates(new int[]{1, 2, 2, 3}));
    }

    @Test
    public void emptyArray() {
        assertFalse(duplicate.hasDuplicates(new int[]{}));
    }
}
