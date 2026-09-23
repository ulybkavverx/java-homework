package сomplex_tasks_clean_code.task2;

public class Main {
    public static void main(String[] args) {
        // создание сервиса
        VideoService videoService = new VideoService(
                new AviVideoAdapter(),
                new MovVideoAdapter(),
                new WmvVideoAdapter()
        );

        // загрузка видео файла в формате AVI
        String videoPath = "path/to/example.avi";
        Video video = videoService.uploadVideo(videoPath);

        // стриминг видео в формате MP4
        Stream stream = videoService.streamVideo(video.getId());

        // вывод инфо о стриме
        System.out.println(
                "Streaming video in "
                        + stream.getFormat()
                        + " format, Video ID: "
                        + video.getId()
        );
    }
}
