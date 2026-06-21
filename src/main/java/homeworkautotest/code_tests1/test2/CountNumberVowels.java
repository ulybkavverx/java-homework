package homeworkautotest.code_tests1.test2;

public class CountNumberVowels {
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
