package homework.test_6.part1.linked_hash_set.task1;

import java.util.LinkedHashSet;

public class LinkedHashSetTask1 {
    // создать LinkedHashSet
    private LinkedHashSet<String> set;

    public LinkedHashSetTask1() {this.set = new LinkedHashSet<>();}

    // добавить 5 строк
    public void addStringsInSet() {
        set.add("Hello");
        set.add("Bye Bye");
        set.add("Good morning");
        set.add("Goodbye");
        set.add("Nice to meet u");
    }

    // проверить порядок элементов при выводе
    // вывести все содержимое
    public void printAllSet() {
        System.out.println("Все содержимое: " + set);
    }
}
