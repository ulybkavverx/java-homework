package homework.test_5.amusement_park;

public class Carousel extends Attraction {
    @Override
    void info() {
        System.out.println("Карусель - это плавные ощущения");
    }

    @Override
    void serviceAttraction() {
        System.out.println("Обслуживание карусели - это техническое обслуживание");
    }
}
