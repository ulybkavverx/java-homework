package homework.test_6.part2.task4;

public class Main {
    public static void main(String[] args) {
        TrackingPageVisits trackingPageVisits = new TrackingPageVisits();

        trackingPageVisits.trackingTotalNumberOfVisits("https://ya.ru/");
        trackingPageVisits.trackingTotalNumberOfVisits("https://ya.ru/");
        trackingPageVisits.trackingTotalNumberOfVisits("https://thelastgame.ru/");

    }
}
