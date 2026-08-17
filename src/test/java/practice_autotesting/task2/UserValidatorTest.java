package practice_autotesting.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {

    // validationEnabled false
    @Test
    public void shouldNotThrowExceptionWhenFlagFalse() {
        User maria = new User(" ", 16, "123.com");
        UserValidator userValidator = new UserValidator(false);

        assertDoesNotThrow(
                () -> userValidator.validate(maria)
        );
    }

    // validateName(): валидное имя
    @Test
    public void shouldNotTrowExceptionWhenNameUserValid() {
        User maria = new User("Maria", 20, "test@example.com");
        UserValidator userValidator = new UserValidator(true);

        assertDoesNotThrow(
                () -> userValidator.validate(maria)
        );
    }

    // validateName(): пустое имя
    @Test
    public void shouldThrowExceptionWhenUserNameIsEmpty() {
        User maria = new User(" ", 20, "test@example.com");
        UserValidator userValidator = new UserValidator(true);

        assertThrows(
                InvalidUserException.class,
                () -> userValidator.validate(maria)
        );
    }

    // validateName(): имя - null
    @Test
    public void shouldThrowExceptionWhenUserNameIsNull() {
        User maria = new User(null, 20, "test@example.com");
        UserValidator userValidator = new UserValidator(true);

        assertThrows(
                InvalidUserException.class,
                () -> userValidator.validate(maria)
        );
    }

    // validateName(): имя не с заглавной буквы
    @Test
    public void shouldThrowExceptionWhenFirstLetterOfNameIsNotCapitalized() {
        User maria = new User("maria", 20, "test@example.com");
        UserValidator userValidator = new UserValidator(true);

        assertThrows(
                InvalidUserException.class,
                () -> userValidator.validate(maria)
        );
    }

    // validateAge(): валидный возраст
    @Test
    public void shouldNotThrowExceptionWhenUserAgeValid() {
        User maria = new User("Maria", 30, "test@example.com");
        UserValidator userValidator = new UserValidator(true);

        assertDoesNotThrow(
                () -> userValidator.validate(maria)
        );
    }

    // validateAge(): возраст меньше 18 и больше 100
    @ParameterizedTest
    @ValueSource(ints = {17, 101})
    public void shouldThrowExceptionWhenAgeUserLess18AndMore100(int age) {
        User maria = new User("Maria", age, "test@example.com");
        UserValidator userValidator = new UserValidator(true);

        assertThrows(
                InvalidUserException.class,
                () -> userValidator.validate(maria)
        );
    }

    // validateAge(): граничный случай
    @ParameterizedTest
    @ValueSource(ints = {18, 100})
    public void shouldNotThrowExceptionWhenAgeUserOnTheBorder18And100(int age) {
        User maria = new User("Maria", age, "test@example.com");
        UserValidator userValidator = new UserValidator(true);

        assertDoesNotThrow(
                () -> userValidator.validate(maria)
        );
    }

    // validateEmail(): валидная почта
    @Test
    public void shouldNotThrowExceptionWhenUserEmailIsValid() {
        User maria = new User("Maria", 20, "test@example.com");
        UserValidator userValidator = new UserValidator(true);

        assertDoesNotThrow(
                () -> userValidator.validate(maria)
        );
    }

    // validateEmail(): пустая почта
    @Test
    public void shouldThrowExceptionWhenEmailIsEmpty() {
        User maria = new User("Maria", 20, " ");
        UserValidator userValidator = new UserValidator(true);

        assertThrows(
                InvalidUserException.class,
                () -> userValidator.validate(maria)
        );
    }

    // validateEmail(): null
    @Test
    public void shouldThrowExceptionWhenEmailIsNull() {
        User maria = new User("Maria", 20, null);
        UserValidator userValidator = new UserValidator(true);

        assertThrows(
                InvalidUserException.class,
                () -> userValidator.validate(maria)
        );
    }

    // validateEmail(): без @
    @Test
    public void shouldThrowExceptionWhenEmailIsNotCharDog() {
        User maria = new User("Maria", 20, "testexample.com");
        UserValidator userValidator = new UserValidator(true);

        assertThrows(
                InvalidUserException.class,
                () -> userValidator.validate(maria)
        );
    }

    // validateEmail(): без .
    @Test
    public void shouldThrowExceptionWhenEmailIsNotCharDot() {
        User maria = new User("Maria", 20, "test@examplecom");
        UserValidator userValidator = new UserValidator(true);

        assertThrows(
                InvalidUserException.class,
                () -> userValidator.validate(maria)
        );
    }
}
