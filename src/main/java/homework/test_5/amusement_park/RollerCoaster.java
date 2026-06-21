package homework.test_5.amusement_park;

public class RollerCoaster extends Attraction {

    @Override
    void info() {
        System.out.println("Американские горки - это острые ощущения");
    }

    @Override
    void serviceAttraction() {
        System.out.println("Обслуживание американских горок - это проверка безопасности");
    }
}
