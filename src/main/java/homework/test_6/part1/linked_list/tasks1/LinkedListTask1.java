package homework.test_6.part1.linked_list.tasks1;

import java.util.LinkedList;

public class LinkedListTask1 {
    // создать список
    private LinkedList<String> list;

    public LinkedListTask1() {this.list = new LinkedList<>();}

    // добавить в список 5 строк
    public void addStringInList() {
        list.add("Hello!");
        list.add("Hello, Mom!");
        list.add("Hello, Dad!");
        list.add("Hello, Cat!");
        list.add("Hello, World!");
    }

    // вывести все элементы списка
    public void printAllList() {
        System.out.println("Весь список: " + list);
    }
}
