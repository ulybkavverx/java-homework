package homework.test_8.functional_interface_lambda.task3;

import java.util.function.Predicate;

public class MainForPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(3));
    }
}
