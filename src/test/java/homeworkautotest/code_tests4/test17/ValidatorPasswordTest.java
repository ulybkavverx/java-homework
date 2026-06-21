package homeworkautotest.code_tests4.test17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorPasswordTest {
    private ValidatorPassword validPassword;

    @BeforeEach
    void setup() {
        validPassword = new ValidatorPassword();
    }

    /**
     * "Password1" → true
     * "pass" → false
     * null → false
     */
    @Test
    public void checkValidPassword() {
        assertTrue(validPassword.isValidPassword("Password1"));
    }

    @Test
    public void checkNoValidShortPassword() {
        assertFalse(validPassword.isValidPassword("pass"));
    }

    @Test
    public void checkNoValidPasswordWithoutNumber() {
        assertFalse(validPassword.isValidPassword("password"));
    }

    @Test
    public void nullCase() {
        assertFalse(validPassword.isValidPassword(null));
    }
}
