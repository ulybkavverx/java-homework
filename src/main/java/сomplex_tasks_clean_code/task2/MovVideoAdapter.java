package сomplex_tasks_clean_code.task2;

public class MovVideoAdapter implements VideoAdapter {

    @Override
    public Video convertToMp4(String videoPath) {
        return new Video(
                "2",
                videoPath,
                "MP4"
        );
    }
}
