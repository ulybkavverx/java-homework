package homework.test_8.functional_interface_lambda.task5;

import java.util.function.Consumer;

public class MainForConsumer {
    public static void main(String[] args) {
        Consumer<String> str1 = System.out::println;
        str1.accept("Hello");
    }
}
