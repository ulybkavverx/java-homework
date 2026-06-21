package homeworkautotest.code_tests2.test10;

public class CheckValidityPhoneNum {
    public boolean isValidPhoneNumber(String phone) {
        if (phone == null) {
            throw new IllegalArgumentException("phone number cannot be null");
        }
        return phone.matches("\\+\\d{1,3}\\s\\d{10}");
    }
}
