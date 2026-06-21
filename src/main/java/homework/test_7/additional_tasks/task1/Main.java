package homework.test_7.additional_tasks.task1;

public class Main {
    public static void main(String[] args) {
        Storage<String> test1 = new Storage<>();
        test1.setElements("Hello");
        System.out.println(test1.getElements());

        Storage<Integer> test2 = new Storage<>();
        test2.setElements(25);
        System.out.println(test2.getElements());
    }
}
