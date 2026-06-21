package homework.test_6.part1.linked_hash_map.task2;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTask2 {
    // создать LinkedHashMap
    private LinkedHashMap<String, String> phoneBook;

    public LinkedHashMapTask2() {this.phoneBook = new LinkedHashMap<>();}

    // добавить пользователей и их телефон (телефонная книга)
    public void addContactUsers() {
        phoneBook.put("Anna", "7896");
        phoneBook.put("Bob", "5687");
        phoneBook.put("Alice", "5615");
        phoneBook.put("Margo", "4035");
        phoneBook.put("John", "9960");
    }

    // найти контакт
    public void findContactInPhoneBook(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Контакт найден: " + name + " номер телефона: " + phoneBook.get(name));
        } else {
            System.out.println("Контакт не найден: " + name);
        }
    }
    // распечатать все контакты
    public void printAllContacts() {
        System.out.println("Все контакты: " + phoneBook);
    }
}
