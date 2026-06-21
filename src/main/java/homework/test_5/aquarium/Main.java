package homework.test_5.aquarium;

public class Main {
    /**
     * Аквариум
     * В аквариуме может находиться одно морское существо.
     * В зависимости от существа, оно ведёт себя по-разному.
     * Примеры:
     * Акула плавает быстро и агрессивно
     * Морская звезда медленно ползает
     * Нужно спроектировать систему, в которой можно добавить существо
     * и продемонстрировать его поведение.
     *
     * Сущности: Sea Creature: Shark, Sea Star, Aquarium
     *
     * Св-ва, действия, связи:
     * Sea Creature - нет св-в
     *          move()
     * Shark -  нет св-в
     *          move() - плавать быстро и агрессивно
     * Sea Star - нет св-в
     *          move() - медленно ползать
     * Aquarium - Sea Creature
     *          setCreature()
     *          showMovement()
     * Связи:
     * Наследование: Sea Creature <- Shark, Sea Star
     * Абстрактный класс - наследование + полиморфизм
     * Интерфейс - полиморфизм
     */
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        SeaCreature shark = new Shark();
        SeaCreature seaStar = new SeaStar();

        aquarium.setSeaCreature(shark);
        aquarium.showMovement();

        aquarium.setSeaCreature(seaStar);
        aquarium.showMovement();
    }
}
