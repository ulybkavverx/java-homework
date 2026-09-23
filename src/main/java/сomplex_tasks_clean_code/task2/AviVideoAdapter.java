package сomplex_tasks_clean_code.task2;

public class AviVideoAdapter implements VideoAdapter {

    @Override
    public Video convertToMp4(String videoPath) {
        return new Video(
                "1",
                videoPath,
                "MP4"
        );
    }
}
