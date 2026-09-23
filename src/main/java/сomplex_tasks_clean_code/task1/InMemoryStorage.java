package сomplex_tasks_clean_code.task1;
//Singleton: Единственное хранилище всех URL
// хранения пар "длинный URL - короткий URL"

import java.util.HashMap;
import java.util.Map;

public class InMemoryStorage implements UrlStorage {

    // хранения пар "длинный URL - короткий URL"
    private final Map<String, String> urls = new HashMap<>();

    //singleton
    private static InMemoryStorage instance;

    // приватный конструктор, запрет на создание через new
    private InMemoryStorage() {
    }

    // метод возвращающий единственный объект хранилища
    public static InMemoryStorage getInstance() {
        if (instance == null) {
            instance = new InMemoryStorage();
        }
        return instance;
    }


    @Override
    public void save(String shortUlr, String longUrl) {
        // добавить пару ключ-значение (короткий url - длинный url)
        urls.put(shortUlr, longUrl);
    }

    @Override
    public String getLongUrl(String shortUrl) {
        // получение значения по ключу
        // получение длинного url по ключу короткий url
        // ключ - короткий url, значение - длинный url
        return urls.get(shortUrl);
    }
}
