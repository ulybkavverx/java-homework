package сomplex_tasks_clean_code.task2;

/**
 * Класс, использующий паттерн Facade,
 * предоставляет методы uploadVideo и streamVideo,
 * упрощая клиентский доступ к функционалу сервиса
 */

public class VideoService {
    private final VideoAdapter aviAdapter;
    private final VideoAdapter movAdapter;
    private final VideoAdapter wmvAdapter;

    public VideoService(VideoAdapter aviAdapter, VideoAdapter movAdapter, VideoAdapter wmvAdapter) {
        this.aviAdapter = aviAdapter;
        this.movAdapter = movAdapter;
        this.wmvAdapter = wmvAdapter;
    }

    // загрузка видео и конвертация видео в MP4
    public Video uploadVideo(String videoPath) {
        if (videoPath.endsWith(".avi")) {
            return aviAdapter.convertToMp4(videoPath);
        }

        if (videoPath.endsWith(".mov")) {
            return movAdapter.convertToMp4(videoPath);
        }

        if (videoPath.endsWith(".wmv")) {
            return wmvAdapter.convertToMp4(videoPath);
        }

        throw new IllegalArgumentException("Неподдерживаемый формат видео");
    }

    // запуск стриминг видео
    public Stream streamVideo(String videoId) {
        return new Stream(
                videoId, "MP4"
        );
    }
}
