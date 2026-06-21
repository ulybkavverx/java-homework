package homework.test_7.tasks_for_generics.task2;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Anna", "Alice", "Bob"};
        GenericMethod.printArray(names);

        Integer[] numbers = {1,20,65,45};
        GenericMethod.printArray(numbers);
    }
}
