package homework.test_8.stream_api_base.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "Hello, World!", "Java", "Bye-Bye");

        List<String> newList = list.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}
