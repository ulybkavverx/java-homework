package homeworkautotest.code_tests1.test3;

import homeworkautotest.code_tests1.test3.LineReversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LineReversalTest {
    private LineReversal lineReversal;

    @BeforeEach
    void setup() {
        lineReversal = new LineReversal();
    }

    /**
     * Положительные тесты:
     * "vlada" -> "adalv"
     * "hello" -> "olleh"
     * "123" -> "321"
     * "" -> ""
     * негативные тесты:
     * null -> null
     */

    @Test
    public void positiveCasesReverseString() {
        assertEquals("adalv", lineReversal.reverse("vlada"));
        assertEquals("olleh", lineReversal.reverse("hello"));
        assertEquals("321", lineReversal.reverse("123"));
        assertEquals("", lineReversal.reverse(""));
    }

    @Test
    public void nullCase() {
        assertNull(lineReversal.reverse(null));
    }

}
