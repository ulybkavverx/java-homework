package homework.test_5.amusement_park;

public class Main {
    /**
     * Парк развлечений
     * В парке есть аттракцион,
     * каждый из которых предлагает свои ощущения и требует обслуживания.
     * Примеры:
     * Американские горки — проверка безопасности
     * Карусель — техническое обслуживание
     * Нужно создать систему, которая управляет аттракционом
     * и выводит информацию для посетителей.
     *
     * Сущности:
     * Attraction: Roller coaster, Carousel, Amusement Park
     * Св-ва, действия, связи:
     * Attraction - нет св-в
     *            инфо про аттракцион (ощущения) - info()
     *            обслуживание - serviceAttraction()
     * Roller coaster - нет св-в
     *                info() - острые ощущения
     *                serviceAttraction() - проверка безопасности
     * Carousel - нет св-в
     *          info() - плавные ощущение
     *          serviceAttraction() - техническое обслуживание
     * Amusement Park - Attraction
     *                setAttraction()
     *                operateAttraction()
     * Наследование:
     * Attraction <- Roller coaster, Carousel
     * Полиморфизм:
     * info(), serviceAttraction()
     * Ассоциация: Amusement Park -> Attraction
     * Абстрактный класс: наследование + полиморфизм
     * Интерфейс: полиморфизм
     *
     */
    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();

        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();

        amusementPark.setAttraction(rollerCoaster);
        amusementPark.operateAttraction();

        amusementPark.setAttraction(carousel);
        amusementPark.operateAttraction();

    }
}
