package homework.test_8.functional_interface_lambda.task1;

public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("На ноль делить нельзя!");
            }
            return a / b;
        };

        System.out.println(add.apply(5, 3));
        System.out.println(subtraction.apply(10, 9));
        System.out.println(multiply.apply(2, 6));
        System.out.println(divide.apply(8, 2));
    }
}
