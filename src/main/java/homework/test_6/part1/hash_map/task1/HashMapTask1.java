package homework.test_6.part1.hash_map.task1;

import java.util.HashMap;

public class HashMapTask1 {
    // создать HashMap <String, Integer>
    private HashMap<String, Integer> users;

    public HashMapTask1() {this.users = new HashMap<>();}

    // добавить в мап 5 пар (имя - возраст)
    public void addUsersInMap() {
        users.put("Alice", 24);
        users.put("Bob", 27);
        users.put("Margo", 19);
        users.put("Vlada", 26);
        users.put("Chris", 29);
    }

//    public void sizeUsers() {
//        System.out.println(users.size());
//    }

    // вывести все записи
    public void printAllUsers() {
        System.out.println("Все пользователи: " + users);
    }
}
