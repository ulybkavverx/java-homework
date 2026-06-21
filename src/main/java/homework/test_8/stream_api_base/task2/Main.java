package homework.test_8.stream_api_base.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 7, 8, 9, 10);

        List<Integer> newList = list.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}
