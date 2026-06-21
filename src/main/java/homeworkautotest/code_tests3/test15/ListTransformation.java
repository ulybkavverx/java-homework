package homeworkautotest.code_tests3.test15;

import java.util.List;
import java.util.stream.Collectors;

public class ListTransformation {
    public List<Integer> mapToLengths(List<String> words) {
        return words.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }
}
