package homework.test_6.part2.task4;

import java.util.HashSet;

public class TrackingPageVisits {
    private HashSet<String> uniqueURL;
    private int totalCount;

    public TrackingPageVisits() {
        this.uniqueURL = new HashSet<>();
        this.totalCount = 0;
    }

    // отслеживает общее кол-во посещений и уникальные страницы
    public void trackingTotalNumberOfVisits(String url) {
        totalCount++;

        uniqueURL.add(url);

        System.out.println("Число уникальных страниц: " + uniqueURL.size());
        System.out.println("Количество посещений: " + totalCount);
    }
}
