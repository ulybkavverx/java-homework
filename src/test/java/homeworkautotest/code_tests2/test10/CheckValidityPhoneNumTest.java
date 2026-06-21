package homeworkautotest.code_tests2.test10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckValidityPhoneNumTest {
    private CheckValidityPhoneNum phoneNumber;

    @BeforeEach
    void setup() {
        phoneNumber = new CheckValidityPhoneNum();
    }

    /**
     * Позитивные кейсы:
     * валидные номера телефонов:
     * "+1 1234567890" -> true
     * "+999 0987654321" -> true
     * негативные кейсы:
     * невалидные номера телефонов:
     * "1 1234567890" -> false
     * "+1 2222" -> false
     * "+1234 1234567890" -> false
     * "" -> false
     * null -> IllegalArgumentException
     */
    @Test
    public void checkValidPhoneNumber() {
        assertTrue(phoneNumber.isValidPhoneNumber("+1 1234567890"));
        assertTrue(phoneNumber.isValidPhoneNumber("+999 0987654321"));
    }

    @Test
    public void checkNoValidPhoneNumber() {
        assertFalse(phoneNumber.isValidPhoneNumber("1 1234567890"));
        assertFalse(phoneNumber.isValidPhoneNumber("+1 2222"));
        assertFalse(phoneNumber.isValidPhoneNumber("+1 12345678901"));
        assertFalse(phoneNumber.isValidPhoneNumber("+1234 1234567890"));
        assertFalse(phoneNumber.isValidPhoneNumber(""));
    }

    @Test
    public void nullCase() {
        assertThrows(
                IllegalArgumentException.class,
                () -> phoneNumber.isValidPhoneNumber(null)
        );
    }
}
