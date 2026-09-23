package сomplex_tasks_clean_code.task3;

public class Main {
    public static void main(String[] args) {
        // создаем прокси вместо настоящей книги
        BookAccess book = new BookProxy(
                "Зеленая миля",
                "zelenaya-milya.jpg",
                "Это тюрьма и чудо",
                "Действие происходит в блоке...",
                "Стивен Кинг"
        );

        System.out.println("Название: " + book.getTitle());
        System.out.println("Содержание: " + book.getContent());
        book.read();
    }
}
