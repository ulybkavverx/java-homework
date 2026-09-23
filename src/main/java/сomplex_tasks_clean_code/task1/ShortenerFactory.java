package сomplex_tasks_clean_code.task1;

public class ShortenerFactory {

    // создание Base62Strategy
    public ShorteningStrategy createBase62Strategy() {
        return new Base62Strategy();
    }

    // создание HashStrategy
    public ShorteningStrategy createHashStrategy() {
        return new HashStrategy();
    }
}
