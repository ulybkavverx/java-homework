package сomplex_tasks_clean_code.task1;

public class Base62Strategy implements ShorteningStrategy {

    @Override
    public String shorten(String longUrl) {
        // получение hash конкретного url
        int hash = longUrl.hashCode();

        // преобразуем число в строку
        return String.valueOf(hash);
    }
}
