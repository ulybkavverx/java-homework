package homeworkautotest.code_tests3.test13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckStringAnagramTest {
    private CheckStringAnagram anagram;

    @BeforeEach
    void setup() {
        anagram = new CheckStringAnagram();
    }

    /**
     * "listen", "silent" → true
     * "java", "python" → false
     * null, "word" → false
     */
    @Test
    public void validStringAnagram() {
        assertTrue(anagram.isAnagram("listen", "silent"));
    }

    @Test
    public void noValidStringAnagram() {
        assertFalse(anagram.isAnagram("java", "python"));
    }

    @Test
    public void ifOneWordWillBeNull() {
        assertFalse(anagram.isAnagram(null, "word"));
    }
}
