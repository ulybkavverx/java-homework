package сomplex_tasks_clean_code.task2;

public class WmvVideoAdapter implements VideoAdapter {

    @Override
    public Video convertToMp4(String videoPath) {
        return new Video(
                "3",
                videoPath,
                "MP4"
        );
    }
}
