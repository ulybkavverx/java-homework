package homework.test_6.part1.linked_hash_map.task2;

public class Main {
    public static void main(String[] args) {
        LinkedHashMapTask2 task2 = new LinkedHashMapTask2();

        task2.addContactUsers();
        task2.findContactInPhoneBook("Anna");
        task2.findContactInPhoneBook("Vlada");

        task2.printAllContacts();
    }
}
