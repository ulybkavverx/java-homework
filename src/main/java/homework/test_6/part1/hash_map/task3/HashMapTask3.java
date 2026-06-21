package homework.test_6.part1.hash_map.task3;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask3 {
    // создать HashMap
    private HashMap<String, Integer> users;

    public HashMapTask3() {this.users = new HashMap<>();}

    // добавить юзеров
    public void addUsers() {
        users.put("Alice", 17);
        users.put("Bob", 19);
        users.put("Vlada", 26);
        users.put("John", 18);
        users.put("Margo", 15);
    }

    // метод, который печатает всех юзеров младше 18 лет
    public void printUnderageUsers() {
        for (Map.Entry<String, Integer> entry: users.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println("Несовершеннолетние пользователи: " + entry);
            }
        }
    }

    // вывод всех юзеров
    public void printAllUsers() {
        System.out.println("Все пользователи: " + users);
    }
}
