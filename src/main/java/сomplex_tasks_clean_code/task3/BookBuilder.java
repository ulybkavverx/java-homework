package сomplex_tasks_clean_code.task3;

//Класс для построения книг с различными характеристиками
public class BookBuilder {
    private String title; // название
    private String cover; // обложка
    private String description; // описание
    private String content; // содержание
    private String author; // автор

    // установка названия книги
    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    // установка обложки
    public BookBuilder setCover(String cover) {
        this.cover = cover;
        return this;
    }

    // установка описания
    public BookBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    // установка содержания
    public BookBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    // установка автора
    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    // создание готового объекта Book
    public Book build() {

        return new Book(
                title,
                cover,
                description,
                content,
                author
        );
    }

}
