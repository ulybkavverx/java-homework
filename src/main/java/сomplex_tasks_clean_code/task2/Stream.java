package сomplex_tasks_clean_code.task2;

// класс Stream представляет поток видео
public class Stream {
    private final String videoId;
    private final String format;

    public Stream(String videoId, String format) {
        this.videoId = videoId;
        this.format = format;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getFormat() {
        return format;
    }
}
