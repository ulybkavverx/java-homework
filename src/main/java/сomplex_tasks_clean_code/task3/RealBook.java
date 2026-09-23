package сomplex_tasks_clean_code.task3;

public class RealBook implements BookAccess {
    private final Book book;

    public RealBook(Book book) {
        this.book = book;
    }


    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public String getContent() {
        return book.getContent();
    }

    @Override
    public void read() {
        book.readBook();
    }
}
