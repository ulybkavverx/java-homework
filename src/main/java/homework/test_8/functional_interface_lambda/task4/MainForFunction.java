package homework.test_8.functional_interface_lambda.task4;

import java.util.function.Function;

public class MainForFunction {
    public static void main(String[] args) {
        Function<String, Integer> str1 = String::length;
        System.out.println(str1.apply("Hello, World!"));
        System.out.println(str1.apply("Java"));
    }
}
