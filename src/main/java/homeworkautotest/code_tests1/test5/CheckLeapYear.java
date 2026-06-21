package homeworkautotest.code_tests1.test5;

public class CheckLeapYear {
    public boolean isLeapYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("year cannot be less zero");
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
