package homework.test_6.part2.task6;

public class Main {
    public static void main(String[] args) {
        StructurePhoneBook phoneBook = new StructurePhoneBook();

        phoneBook.addContactInPhoneBook();
        phoneBook.findPhoneByName("Anna");
        phoneBook.findPhoneByName("Rick");
        phoneBook.findPhoneByName("John");
    }
}
