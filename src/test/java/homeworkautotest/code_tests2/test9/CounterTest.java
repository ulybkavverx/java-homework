package homeworkautotest.code_tests2.test9;

import homeworkautotest.code_tests2.test9.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CounterTest {
    private Counter counter;

    @BeforeEach
    void setup() {
        counter = new Counter();
    }

    /**
     * Обычная строка: "Hello world" → countWords() → 2
     * Строка с лишними пробелами: " Java is awesome " → countWords() → 4
     * Пустая строка => "" -> 0
     * строка с несколькими пробелами => " " -> 0
     * null -> IllegalArgumentException
     */

    @Test
    public void ordinaryString() {
        assertEquals(2, counter.countWords("Hello world"));
    }

    @Test
    public void stringWithExtraSpaces() {
        assertEquals(3, counter.countWords(" Java is awesome "));
    }

    @Test
    public void emptyString() {
        assertEquals(0, counter.countWords(""));
    }

    @Test
    public void severalSpaces() {
        assertEquals(0, counter.countWords(" "));
    }


    @Test
    public void nullCase() {
        assertThrows(
                IllegalArgumentException.class,
                () -> counter.countWords(null)
        );
    }
}
