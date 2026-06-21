package homework.test_6.part1.tree_set.task2;

import java.util.TreeSet;

public class TreeSetTask2 {
    // создать TreeSet
    private TreeSet<Integer> numbers;

    public TreeSetTask2() {this.numbers = new TreeSet<>();}

    // добавить числа в TreeSet, без дубликатов
    public void addNumbersInSetNoDuplicates(Integer number) {
        if (numbers.contains(number)) {
            System.out.println("Число " + number + " уже содержится во множестве");
        } else {
            numbers.add(number);
            System.out.println("Число " + number + " добавлено во множество");
        }
    }

    // вывести все содержимое
    public void printAllNumbers() {
        System.out.println("Все содержимое: " + numbers);
    }
}
