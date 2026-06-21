package homework.test_8.stream_api_base.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> list2 = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(list2);
    }
}
