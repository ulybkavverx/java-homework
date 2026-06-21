package homeworkautotest.code_tests4.test18;

public class FindGreatestDivisor {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
