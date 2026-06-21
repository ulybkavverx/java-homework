package homework.test_8.stream_api_grouping_reduction.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Группировка чисел по чётности
        Map<Boolean, List<Integer>> isEven = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(isEven);


        // Поиск среднего значения чисел
        Double avg = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(avg);
    }
}
