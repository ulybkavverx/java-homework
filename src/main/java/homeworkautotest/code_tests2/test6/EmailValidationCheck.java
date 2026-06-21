package homeworkautotest.code_tests2.test6;

public class EmailValidationCheck {
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }
}
