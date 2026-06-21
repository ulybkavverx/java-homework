package homework.test_6.part1.linked_hash_map.task1;

import java.util.LinkedHashMap;

public class LinkedHashMapTask1 {
    // создать LinkedHashMap
    private LinkedHashMap<Integer, String> users;

    public LinkedHashMapTask1() {this.users = new LinkedHashMap<>();}

    // добавить 5 элементов
    public void addUsersInMap() {
        users.put(1, "Anna");
        users.put(2, "Bob");
        users.put(3, "John");
        users.put(4, "Alice");
        users.put(5, "Margo");
    }

    // вывести в порядке добавления
    public void printAllUsers() {
        System.out.println("Все пользователи: " + users);
    }
}
