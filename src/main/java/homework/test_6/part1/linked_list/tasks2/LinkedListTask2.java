package homework.test_6.part1.linked_list.tasks2;

import java.util.LinkedList;

public class LinkedListTask2 {
    // создать список
    private LinkedList<String> list;

    public LinkedListTask2() {this.list = new LinkedList<>();}

    // добавить в список строки
    public void addStringsInList() {
        list.add("Hello");
        list.add("Oh, I'm glad");
        list.add("Bye-Bye");
    }

    // печать первый и последний элементы
    public void printFirstElementFromList() {
        System.out.println("Первый элемент: " + list.getFirst());
    }
    public void printLastElementFromList() {
        System.out.println("Последний элемент: " + list.getLast());
    }
}
