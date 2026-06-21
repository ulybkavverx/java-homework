package practice_java.practice_7.contact_book;

import java.util.HashMap;

public class ContactBook {
    // ключ-знач (имя-телефон)
    private HashMap<String, Integer> contscts;

    public ContactBook() {
        this.contscts = new HashMap<>();
    }

    // добавить контакт
    public void addContact(String name, Integer phone) {
        contscts.put(name, phone);
    }

    // поиск контакта по имени
    public Integer getPhone(String name) {
        return contscts.get(name);
    }

    // обновление телефона по имени
    public void updatePhone(String name, Integer updatedPhone) {
        contscts.put(name, updatedPhone);
    }

    public void printContacts() {
        System.out.println("Все контакты:");
        contscts.forEach(
                (name, phone) -> {
                    System.out.println("имя " + name + ", телефон " + phone);
                }
        );
        System.out.println();
    }
}
