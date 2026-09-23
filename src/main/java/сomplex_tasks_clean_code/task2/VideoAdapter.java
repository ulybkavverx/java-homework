package сomplex_tasks_clean_code.task2;

/**
 * Интерфейс и его реализации для каждого поддерживаемого формата видео, преобразующие видео в формат MP4
 */

public interface VideoAdapter {
    Video convertToMp4(String videoPath);
}
