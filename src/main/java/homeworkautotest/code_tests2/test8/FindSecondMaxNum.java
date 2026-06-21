package homeworkautotest.code_tests2.test8;

import java.util.Arrays;

public class FindSecondMaxNum {
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(numbers.length - 2)
                .findFirst()
                .orElseThrow();
    }
}
