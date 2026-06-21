package homework.test_5.zoo;

public class Main {
    /***
     * Зоопарк
     * В зоопарке есть одно животное,
     * но оно может быть разным: птица или слон
     * Каждое животное издаёт уникальные звуки и передвигается по-своему.
     * Например, слон трубит и ходит, а птица чирикает и летает.
     * Нужно спроектировать систему, которая может работать с любым животным,
     * добавлять его в зоопарк и демонстрировать его поведение.
     *
     * Сущности: Animal: Elephant, Bird, Zoo
     *
     * Св-ва, действия, связи:
     * Animal: нет св-в
     *        makeSound() - издать звук
     *        move() - передвигаться
     * Elephant: нет св-в
     *         makeSound() - трубить
     *         move() - ходить
     * Bird:   нет св-в
     *         makeSound() - чирикать
     *         move() - летать
     * Zoo:    animal
     *         setAnimal(Animal animal)
     *         showAnimalBehavior()
     * Наследование: Animal <- Elephant, Bird
     * Ассоциация: Zoo -> Animal
     *
     * Абстрактный класс - наследование + полиморфизм
     * Интерфейс - полиморфизм
     */

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal elephant = new Elephant();
        Animal bird = new Bird();

        zoo.setAnimal(elephant);
        zoo.showAnimalBehavior();

        zoo.setAnimal(bird);
        zoo.showAnimalBehavior();
    }
}
