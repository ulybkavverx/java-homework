package homeworkautotest.code_tests4.test16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LineSplitTest {
    private LineSplit lineSplit;

    @BeforeEach
    void setup() {
        lineSplit = new LineSplit();
    }

    /**
     * "Java,Python,C++", "," → ["Java", "Python", "C++"]
     * "", "," → [""]
     * "word", "," → ["word"]
     */

    @Test
    public void splittingStringUsingDelimiter() {
        assertArrayEquals(
                new String[]{"Java", "Python", "C++"},
                lineSplit.splitString("Java,Python,C++", ",")
        );
    }

    @Test
    public void emptyStringWithDelimiter() {
        assertArrayEquals(
                new String[]{""},
                lineSplit.splitString("", ",")
        );
    }

    @Test
    public void stringWithoutDelimiter() {
        assertArrayEquals(
                new String[]{"word"},
                lineSplit.splitString("word", ",")
        );
    }
}
