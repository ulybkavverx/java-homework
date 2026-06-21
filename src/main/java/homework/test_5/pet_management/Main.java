package homework.test_5.pet_management;

public class Main {
    /***
     * Управление домашними питомцами
     * В системе может быть один домашний питомец,
     * у каждого вида свои особенности ухода.
     * Примеры:
     * Собака гуляет и ест сухой корм
     * Кошка играет и ест влажный корм
     * Нужно спроектировать систему, которая позволяет взаимодействовать
     * с любым питомцем с учётом его особенностей.
     *
     * Сущности: Pet: Dog, Cat, PetManager
     *
     * Св-ва, действия, связи:
     * Pet - нет св-в
     *       feed()
     *       interact()
     * Dog - нет св-в
     *       feed() - есть сухой корм
     *       interact() - гулять
     * Cat - нет св-в
     *       feed() - есть влажный корм
     *       interact() - играть
     * PetManager - pet
     *            setPet(Pet pet)
     *            handlePet()
     * Связи:
     * Наследование: Pet <- Dog, Cat
     * Абстрактный класс = наследование + полиморфизм
     * Интерфейс = полиморфизм
     *
     */

    public static void main(String[] args) {
        PetManager petManager = new PetManager();

        Pet dog = new Dog();
        Pet cat = new Cat();

        petManager.setPet(dog);
        petManager.handlePet();

        petManager.setPet(cat);
        petManager.handlePet();
    }
}
