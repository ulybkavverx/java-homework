package homework.test_6.part1.array_list.task3;

import java.util.ArrayList;

public class ArrayListTask3 {
    // создать список
    private ArrayList<String> list;

    public ArrayListTask3() {this.list = new ArrayList<>();}

    // добавить в список строки
    public void addTextInList() {
        list.add("Hello");
        list.add("Bye");
        list.add("Nice to meet u");
        list.add("Papa");
    }

    // найти самую длинную строку и вывести ее
    public void findLongerString() {
        String longer = list.get(0);
        for (String str : list) {
           if (str.length() > longer.length()) {
               longer = str;
           }
        }
        System.out.println("Самая длинная строчка: " + longer);
    }

    public void printAllList() {
        System.out.println("Весь список: " + list);
    }
}
