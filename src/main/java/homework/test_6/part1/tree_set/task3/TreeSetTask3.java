package homework.test_6.part1.tree_set.task3;

import javax.swing.plaf.PanelUI;
import java.util.TreeSet;

public class TreeSetTask3 {
    // создать TreeSet
    private TreeSet<Integer> numbers;

    public TreeSetTask3() {this.numbers = new TreeSet<>();}

    // добавить числа
    public void addNumbersInSet() {
        numbers.add(55);
        numbers.add(32);
        numbers.add(14);
        numbers.add(27);
        numbers.add(9);
    }

    // найти ближайшее большее и меньшее число к заданному в TreeSet
    public void findClothesNumbers(int number) {
        Integer highNumber = numbers.higher(number);
        Integer lowerNumber = numbers.lower(number);

        System.out.println("Самое ближайшее наибольшее число к " + number + ": " + highNumber);
        System.out.println("Самое ближайшее наименьшее число к " + number + ": " + lowerNumber);
    }

    // вывод всего содержимого
    public void printAllNumbers() {
        System.out.println("Все содержимое: " + numbers);
    }
}



