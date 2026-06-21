package homework.test_6.part1.hash_map.task2;

import java.util.HashMap;

public class HashMapTask2 {
    // создать HashMap
    private HashMap<String, Integer> users;

    public HashMapTask2() {this.users = new HashMap<>();}

    // добавить юзеров
    public void addUsersInMap() {
        users.put("Anna", 24);
        users.put("Bob", 35);
        users.put("Alice", 25);
        users.put("Vlada", 26);
    }

    // проверить, есть ли определенное имя
    public void checkByName(String name) {
        if (users.containsKey(name)) {
            System.out.println("Имя " + name + " есть в базе");
        } else {
            System.out.println("Имени " + name + " нет в базе");
        }
    }
    // вывести все записи
    public void printAllUsers() {
        System.out.println("Все пользователи: " + users);
    }
}
