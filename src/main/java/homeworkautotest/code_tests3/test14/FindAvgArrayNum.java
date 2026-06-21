package homeworkautotest.code_tests3.test14;

import java.util.Arrays;

public class FindAvgArrayNum {
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers)
                .average()
                .orElseThrow();
    }
}
