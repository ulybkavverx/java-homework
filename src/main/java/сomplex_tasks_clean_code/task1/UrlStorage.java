package сomplex_tasks_clean_code.task1;

/**
 * Интерфейс для хранения пар "длинный URL - короткий URL"
 * с различными реализациями (например, память, файлы, базы данных).
 */

// интерфейс описывает что должно уметь любое хранилище url
public interface UrlStorage {

    // хранение связей короткий url -> длинный url
    void save(String shortUlr, String longUrl);

    // получение длинного url, если передать короткий url
    String getLongUrl(String shortUrl);
}
