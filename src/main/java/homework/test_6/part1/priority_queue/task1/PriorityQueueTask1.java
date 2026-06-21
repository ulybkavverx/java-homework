package homework.test_6.part1.priority_queue.task1;

import java.util.PriorityQueue;

public class PriorityQueueTask1 {
    // Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
    private PriorityQueue<Integer> numbers;

    public PriorityQueueTask1() {this.numbers = new PriorityQueue<>();}

    public void addNumbers() {
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        numbers.add(7);
    }

    public void printAllNumbers() {
        while (!numbers.isEmpty()) {
            System.out.println("Все элементы: " + numbers);
            numbers.poll();
        }
    }
}
