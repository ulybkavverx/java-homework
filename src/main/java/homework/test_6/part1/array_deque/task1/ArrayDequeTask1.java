package homework.test_6.part1.array_deque.task1;

import java.util.ArrayDeque;

public class ArrayDequeTask1 {
    private ArrayDeque<Integer> elements;

    public ArrayDequeTask1() {this.elements = new ArrayDeque<>();}

    public void addElementsInDeque() {
        elements.add(2);
        elements.add(5);
        elements.add(7);
        elements.add(1);
    }

    public void printAllElements() {
        System.out.println("Все элементы: " + elements);
    }
}
