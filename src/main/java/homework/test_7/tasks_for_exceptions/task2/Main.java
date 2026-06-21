package homework.test_7.tasks_for_exceptions.task2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(UncheckedException.divide(10,0));
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }

        try {
            System.out.println(UncheckedException.divide(10,2));
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }
    }
}
