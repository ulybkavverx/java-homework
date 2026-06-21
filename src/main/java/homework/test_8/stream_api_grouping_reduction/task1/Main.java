package homework.test_8.stream_api_grouping_reduction.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Привет", "Пока", "Кот", "Кит", "Ананас");

        Map<Character, List<String>> grouped = str.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(grouped);

    }
}
