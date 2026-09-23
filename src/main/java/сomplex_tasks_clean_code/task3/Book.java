package сomplex_tasks_clean_code.task3;

// класс Book представляет книгу
public class Book {
    private final String title; // название
    private final String cover; // обложка
    private final String description; // описание
    private final String content; // содержание
    private final String author; // автор

    // конструктор
    public Book(String title,
                String cover,
                String description,
                String content,
                String author) {
        this.title = title;
        this.cover = cover;
        this.description = description;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getCover() {
        return cover;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    // метод чтения книг
    public void readBook() {

        System.out.println("Читаем книгу: " + title);
        System.out.println(content);
    }
}
