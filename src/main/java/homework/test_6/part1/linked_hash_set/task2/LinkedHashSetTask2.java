package homework.test_6.part1.linked_hash_set.task2;

import java.util.LinkedHashSet;

public class LinkedHashSetTask2 {
    // создать LinkedHashSet
    private LinkedHashSet<String> names;

    public LinkedHashSetTask2() {this.names = new LinkedHashSet<>();}

    // добавить элементы с проверкой на дубликаты
    public void addNamesInSet(String name) {
       if (names.contains(name)) {
           System.out.println("Это имя уже существует: " + name);
       } else {
           names.add(name);
           System.out.println("Имя добавлено: " + name);
       }
    }

    // вывод всего содержимого
    public void printAllNamesInSet() {
        System.out.println("Все содержимое: " + names);
    }
}
