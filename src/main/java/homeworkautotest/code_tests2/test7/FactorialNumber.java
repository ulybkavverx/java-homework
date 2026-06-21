package homeworkautotest.code_tests2.test7;

public class FactorialNumber {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
