package homework.test_5.farm;

public class Main {
    /**
     * Ферма
     * На ферме содержится одно домашнее животное.
     * У каждого животного свои функции и нужды.
     * Примеры:
     * Корова даёт молоко, нуждается в выпасе
     * Курица несёт яйца, требует зерно
     * Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.
     *
     * Сущности:
     * FarmAnimal: Cow, Chicken, Farm
     *
     * св-ва, действия, связи:
     * FarmAnimal - нет св-в
     *            produce()
     *            care()
     *            feed()
     * Cow - нет св-в
     *     produce() - дать молоко
     *     care() - нужда в выпасе
     *     feed() - есть траву
     * Chicken - нет св-в
     *      produce() - нести яйца
     *      care() - нужда в кормушке
     *      feed() - требует зерно
     * Farm - FarmAnimal
     *      - setAnimal()
     *      - serviceAnimal()
     * Связи:
     * Наследование: FarmAnimal <- Cow, Chicken
     * Полиморфизм: produce(), feed(), care()
     * Абстракция: FarmAnimal
     * Ассоциация: Farm <- FarmAnimal
     *
     * Абстрактный класс: наследование + полиморфизм
     * Интерфейс: полиморфизм
     *
     */
    public static void main(String[] args) {
        Farm farm = new Farm();

        FarmAnimal cow = new Cow();
        FarmAnimal chicken = new Chicken();

        farm.setFarmAnimal(cow);
        farm.serviceAnimal();

        farm.setFarmAnimal(chicken);
        farm.serviceAnimal();
    }
}
