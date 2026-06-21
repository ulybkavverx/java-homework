package homeworkautotest.code_tests4.test20;

import java.util.Arrays;

public class CheckingHasDuplicates {
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .count() != numbers.length;
    }
}
