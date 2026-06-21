package homeworkautotest.code_tests3.test11;

import java.util.List;
import java.util.stream.Collectors;

public class FilterListNumbers {
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
