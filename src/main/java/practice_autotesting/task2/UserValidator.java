package practice_autotesting.task2;

/*
UserValidator - сервис для проверки валидации
User - класс, есть поля: name, age, email
Flag - validationEnabled (валидация, только если true)
Exception - InvalidUserException
 */

public class UserValidator {
    // флаг
    private boolean validationEnabled;

    public UserValidator(boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    public void validate(User user) {
        if (!validationEnabled) {
            return;
        }
        validateName(user);
        validateAge(user);
        validateEmail(user);
    }


    // проверка имени - не пустое, начинаться с заглавной буквы
    private void validateName(User user) {
        String name = user.getName();

        if (name == null) {
            throw new InvalidUserException("Name cannot be null");
        }

        if (name.isEmpty()) {
            throw new InvalidUserException("Name cannot be empty");
        }

        char firstLetter = name.charAt(0);
        if (!Character.isUpperCase(firstLetter)) {
            throw new InvalidUserException("Name must begin with a capital letter");
        }
    }

    // проверка возраста - в пределах от 18 до 100 лет
    private void validateAge(User user) {
        int age = user.getAge();

        if (age < 18 || age > 100) {
            throw new InvalidUserException("Age must be between 18 and 100");
        }
    }

    // проверка почты - стандартный формат почты (123abc@mail.com)
    private void validateEmail(User user) {
        String email = user.getEmail();

        if (email == null) {
            throw new InvalidUserException("Email cannot be null");
        }

        if (email.isEmpty()) {
            throw new InvalidUserException("Email cannot be empty");
        }

        if (!email.contains("@") || !email.contains(".")) {
            throw new InvalidUserException("Invalid email");
        }
    }
}
