package homework.test_8.stream_api_base.task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 4, 3, 2, 3, 1, 1, 6, 5);

        List<Integer> list2 = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list2);
    }
}
