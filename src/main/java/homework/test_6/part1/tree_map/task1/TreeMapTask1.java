package homework.test_6.part1.tree_map.task1;

import java.util.TreeMap;

public class TreeMapTask1 {
    private TreeMap<String, Integer> users;

    public TreeMapTask1() {this.users = new TreeMap<>();}

    public void addUsersAndPoints() {
        users.put("Anna", 4);
        users.put("Bob", 3);
        users.put("Alice", 5);
        users.put("John", 3);
        users.put("Margo", 1);
    }

    public void printAllUsers() {
        System.out.println("Все данные: " + users);
    }
}
