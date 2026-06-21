package homework.test_8.stream_api_aggregation_op.max_min_sum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Поиск максимального элемента
        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow();

        System.out.println(max);

        // Поиск минимального элемента
        int min = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow();

        System.out.println(min);

        // Сумма всех элементов списка
        int sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(sum);
    }
}
