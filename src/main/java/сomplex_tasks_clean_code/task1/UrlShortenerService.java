package сomplex_tasks_clean_code.task1;

/**
 * Класс, отвечающий за логику сокращения и восстановления URL
 */

public class UrlShortenerService {
    // strategy отвечает за способ сокращения url
    private final ShorteningStrategy strategy;

    // storage отвечает за хранение
    private final UrlStorage storage;

    // конструктор в котором передаем нужную стратегию и хранение
    public UrlShortenerService(ShorteningStrategy strategy, UrlStorage storage) {
        this.strategy = strategy;
        this.storage = storage;
    }

    // метод для получения короткого url, принимает длинный url
    public String shortUrl(String longUrl) {
        // strategy сокращает длинный url
        String shortUrl = strategy.shorten(longUrl);

        // сохранить связи - короткий url -> ддлинный url
        storage.save(shortUrl, longUrl);

        // возвращаем короткий url
        return shortUrl;
    }

    // восстановление длинного url по короткому url
    public String expandUrl(String shortUrl) {

        // ищем длинный url в хранилище
        return storage.getLongUrl(shortUrl);
    }
}
