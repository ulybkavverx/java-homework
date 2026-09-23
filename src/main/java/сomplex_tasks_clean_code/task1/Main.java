package сomplex_tasks_clean_code.task1;

public class Main {
    public static void main(String[] args) {
        // создание фабрики
        ShortenerFactory factory = new ShortenerFactory();

        // фабрика создает тип Base62Strategy
        ShorteningStrategy strategyBase = factory.createBase62Strategy();

        // получение singleton-хранилища
        UrlStorage storage = InMemoryStorage.getInstance();

        //создание сервиса
        UrlShortenerService service = new UrlShortenerService(strategyBase, storage);

        // сокращаем длинный url
        String shortUrl = service.shortUrl("https://example.com/very/long/url");

        // вывод короткого url
        System.out.println("Short URL: " + shortUrl);

        //восстановление url
        String longUrl = service.expandUrl(shortUrl);

        // вывод ориг url
        System.out.println("Original URL: " + longUrl);
    }
}
