package homeworkautotest.code_tests2.test9;

public class Counter {
    public int countWords(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("sentence cannot be null");
        }
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
