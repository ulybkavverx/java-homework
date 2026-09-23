package сomplex_tasks_clean_code.task1;

public class HashStrategy implements ShorteningStrategy {

    @Override
    public String shorten(String longUrl) {
        return String.valueOf(longUrl.hashCode());
    }
}
