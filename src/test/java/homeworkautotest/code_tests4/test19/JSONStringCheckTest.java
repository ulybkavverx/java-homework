package homeworkautotest.code_tests4.test19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JSONStringCheckTest {
    private JSONStringCheck jsonString;

    @BeforeEach
    void setup() {
        jsonString = new JSONStringCheck();
    }

    /**
     * "{"key":"value"}" → true
     * "invalid json" → false
     * null → false
     */
    @Test
    public void checkValidJSON() {
        assertTrue(jsonString.isValidJSON("{\"key\":\"value\"}"));
    }

    @Test
    public void checkNoValidJSON() {
        assertFalse(jsonString.isValidJSON("invalid json"));
    }

    @Test
    public void nullCase() {
        assertFalse(jsonString.isValidJSON(null));
    }
}
