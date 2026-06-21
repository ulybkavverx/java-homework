package homework.test_8.stream_api_base.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Cat", "Dog", "Java");

        List<Integer> list2 = list.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(list2);
    }
}
