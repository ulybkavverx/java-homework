package practice_java.practice_7.contact_book;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("Анна", 7985);
        contactBook.addContact("Никита", 2354);

        contactBook.printContacts();

        contactBook.updatePhone("Анна", 7000);
        contactBook.printContacts();
    }
}
