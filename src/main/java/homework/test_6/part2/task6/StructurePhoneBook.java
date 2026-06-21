package homework.test_6.part2.task6;

import java.util.HashMap;

public class StructurePhoneBook {
    private HashMap<String, String> phoneBook;

    public StructurePhoneBook() {this.phoneBook = new HashMap<>();}

    public void addContactInPhoneBook() {
        phoneBook.put("Anna", "156");
        phoneBook.put("Bob", "563");
        phoneBook.put("Alice", "896");
        phoneBook.put("Margo", "145");
        phoneBook.put("John", "850");
    }

    public void findPhoneByName(String name) {
       if (phoneBook.containsKey(name)) {
           System.out.println("Имя: " + name + " номер телефона: " + phoneBook.get(name));
       } else {
           System.out.println("Контакт " + name + " не добавлен в телефонную книгу");
       }
    }
}
