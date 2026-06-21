package homework.test_6.part1.hash_set.task2;

import java.util.HashSet;

public class HashSetTask2 {
    // создать HashSet
    private HashSet<Integer> set;

    public HashSetTask2() {this.set = new HashSet<>();}

    // добавить 10 чисел
    public void addNumbersInSet() {
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
    }

    // содержит ли HashSet заданное число
    public void checkGivenNumberInSet(int number) {
        if (set.contains(number)) {
            System.out.println("Число найдено: " + number);
        } else {
            System.out.println("Число не найдено: " + number);
        }
    }

    // вывести все содержимое
    public void printAllSet() {
        System.out.println("Все содержимое: " + set);
    }
}
