package homework.test_5.farm;

public class Chicken extends FarmAnimal {

    @Override
    void produce() {
        System.out.println("Курица несет яйца");
    }

    @Override
    void care() {
        System.out.println("Курица нуждается в кормушке");
    }

    @Override
    void feed() {
        System.out.println("Курица должна есть зерно");
    }
}
