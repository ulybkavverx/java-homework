package homework.test_6.part1.array_list.tasks1;

import java.util.ArrayList;

public class ArrayListTask1 {
    // создать список
    private ArrayList<Integer> numbers;

    public ArrayListTask1() {
        this.numbers = new ArrayList<>();
    }

    // добавить в список 5 чисел
    public void addNumbersInList() {
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
    }
    // добавить в список еще одно число в конец
    public void addOneMoreNumber(int n) {
        numbers.add(n);
        System.out.println("Добавлено еще одно число: ");
    }

    // вывести весь список
    public void printAllList() {
        System.out.println("Весь список: " + numbers);
    }
}
