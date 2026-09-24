package сomplex_tasks_clean_code.task3;

// Proxy класс, который управляет доступом к объекту Book,
// осуществляя загрузку данных только по необходимости
// (например, при первом обращении к содержанию книги).
public class BookProxy implements BookAccess {
    private BookAccess realBook;

    // данные необходимые для создания книги
    private final String title; // название
    private final String cover; // обложка
    private final String description; // описание
    private final String content; // содержание
    private final String author; // а

    public BookProxy(String title, String cover, String description, String content, String author) {
        this.title = title;
        this.cover = cover;
        this.description = description;
        this.content = content;
        this.author = author;
    }

    // ленивая загрузка
    public void loadBook() {
        if (realBook == null) {
            System.out.println("Загружаем книгу: " + title);


            Book book = new BookBuilder()
                    .setTitle(title)
                    .setCover(cover)
                    .setDescription(description)
                    .setContent(content)
                    .setAuthor(author)
                    .build();

            realBook = new RealBook(book);
        }
    }

    @Override
    public String getTitle() {
        loadBook();
        return realBook.getTitle();
    }

    @Override
    public String getContent() {
        loadBook();
        return realBook.getContent();
    }

    @Override
    public void read() {
        loadBook();
        realBook.read();
    }
}
