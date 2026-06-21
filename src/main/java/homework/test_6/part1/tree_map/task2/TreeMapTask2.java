package homework.test_6.part1.tree_map.task2;

import java.util.TreeMap;

public class TreeMapTask2 {
    // Найдите минимальный и максимальный ключ в TreeMap.
    private TreeMap<Integer, String> map;

    public TreeMapTask2() {this.map = new TreeMap<>();}

    public void addElementsInMap() {
        map.put(1, "Anna");
        map.put(2, "Bob");
        map.put(3, "Alice");
        map.put(4, "John");
        map.put(5, "Margo");
    }

    public int firstKey() {
        return map.firstKey();
    }
    public int lastKey() {
        return map.lastKey();
    }

    public void printAll() {
        System.out.println("Минимальный ключ в TreeMap: " + firstKey());
        System.out.println("Максимальный ключ в TreeMap: " + lastKey());
    }
}
