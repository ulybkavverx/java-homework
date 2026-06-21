package homework.test_6.part1.tree_set.task1;

import java.util.TreeSet;

public class TreeSetTask1 {
    // создать TreeSet
    private TreeSet<Integer> numbers;

    public TreeSetTask1() {this.numbers = new TreeSet<>();}

    // добавить 5 чисел
    public void addNumbersInSet() {
        numbers.add(55);
        numbers.add(5);
        numbers.add(86);
        numbers.add(45);
        numbers.add(6);
    }

    // вывести все содержимое (обратить внимание на порядок)
    public void printAllNumbersInSet() {
        System.out.println("Все содержимое: " + numbers);
    }
}
