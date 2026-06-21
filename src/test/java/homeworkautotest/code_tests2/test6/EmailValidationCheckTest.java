package homeworkautotest.code_tests2.test6;

import homeworkautotest.code_tests2.test6.EmailValidationCheck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidationCheckTest {
    private EmailValidationCheck emailExample;

    @BeforeEach
    void setup() {
        emailExample = new EmailValidationCheck();
    }

    /**
     * Позитивные кейсы:
     * валидный email:
     * "test@example.com" -> true
     * негативные кейсы:
     * "" -> false
     * "bad@.com" -> false
     * "no-at-symbol" -> false
     * null -> false
     */

    @Test
    public void checkValidateEmail() {
        assertTrue(emailExample.isValidEmail("test@example.com"));
        assertTrue(emailExample.isValidEmail("a@b.cc"));
    }

    @Test
    public void checkNoValidateEmail() {
        assertFalse(emailExample.isValidEmail("bad@.com"));
        assertFalse(emailExample.isValidEmail("no-at-symbol"));
        assertFalse(emailExample.isValidEmail("user@domain"));
        assertFalse(emailExample.isValidEmail(""));
    }

    @Test
    public void nullCase() {
        assertFalse(emailExample.isValidEmail(null));
    }
}
