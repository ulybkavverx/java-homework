package homework.test_6.part1.linked_hash_set.task2;

public class Main {
    public static void main(String[] args) {
        LinkedHashSetTask2 task2 = new LinkedHashSetTask2();

        task2.addNamesInSet("Vlada");
        task2.printAllNamesInSet();

        task2.addNamesInSet("Alice");
        task2.printAllNamesInSet();

        task2.addNamesInSet("Vlada");
        task2.printAllNamesInSet();
    }
}
