package сomplex_tasks_clean_code.task1;

/**
 * Интерфейс, который определяет метод для сокращения URL
 * Реализации могут включать Base62, хеширование, UUID и другие
 */

public interface ShorteningStrategy {
    // метод получает длинный url
    // возвращает короткий url
    String shorten(String longUrl);
}
