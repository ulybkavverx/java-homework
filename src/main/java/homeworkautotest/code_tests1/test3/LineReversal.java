package homeworkautotest.code_tests1.test3;

public class LineReversal {
    public String reverse(String input) {
        if (input == null) {
            return null;
        }

        return new StringBuilder(input).reverse().toString();
    }
}
