package homework.test_6.part1.tree_set.task2;

public class Main {
    public static void main(String[] args) {
        TreeSetTask2 task2 = new TreeSetTask2();

        task2.addNumbersInSetNoDuplicates(3);
        task2.printAllNumbers();

        task2.addNumbersInSetNoDuplicates(1);
        task2.printAllNumbers();

        task2.addNumbersInSetNoDuplicates(6);
        task2.printAllNumbers();

        task2.addNumbersInSetNoDuplicates(3);
        task2.printAllNumbers();
    }
}
