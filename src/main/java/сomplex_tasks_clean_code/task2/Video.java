package сomplex_tasks_clean_code.task2;

// класс Video хранит инфо о видео
public class Video {
    private final String id; // уник id
    private final String path; // путь к видеофайлу
    private final String format; // формат видео

    public Video(String id, String path, String format) {
        this.id = id;
        this.path = path;
        this.format = format;
    }

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String getFormat() {
        return format;
    }
}
