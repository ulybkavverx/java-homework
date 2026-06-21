package homeworkautotest.code_tests1.test4;

import java.util.Arrays;

public class FindMaxNumber {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers)
                .max()
                .orElseThrow();
    }
}
