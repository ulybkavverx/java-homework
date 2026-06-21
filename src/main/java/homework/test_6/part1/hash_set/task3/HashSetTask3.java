package homework.test_6.part1.hash_set.task3;

import java.util.HashSet;

public class HashSetTask3 {
    // создать HashSet
    private HashSet<String> names;

    public HashSetTask3() {this.names = new HashSet<>();}

    // добавить в HashSet список имен
    public void addNamesInSet() {
        names.add("Anna");
        names.add("Bob");
        names.add("Vlada");
        names.add("John");
        names.add("Alice");
    }

    // проверить содержится ли мое имя в HashSet и выводит соответствующее сообщение
    public void checkNamesInSet(String name) {
        if (names.contains(name)) {
            System.out.println("Имя найдено: " + name);
        } else {
            System.out.println("Имя не найдено: " + name);
        }
    }

    // вывод всех имен
    public void printAllNamesInSet() {
        System.out.println("Все имена: " + names);
    }
}
