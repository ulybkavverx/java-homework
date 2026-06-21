package homework.test_6.part1.array_list.tasks2;

import java.util.ArrayList;

public class ArrayListTask2 {
    // создать список
    private ArrayList<Integer> numbers;

    public ArrayListTask2() {this.numbers = new ArrayList<>();}


    // добавить в список числа
    public void addNumbersInList() {
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
    }

    // метод для проверки четности чисел в списке и вывод четных чисел
    public void printOnlyEvenNumbers() {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Четные числа: " + number);
            }
        }
    }
    // вывести весь список
    public void printAllList() {
        System.out.println("Весь список: " + numbers);
    }
}
