package homework.test_5.pet_management;

public class Cat extends Pet {

    @Override
    void feed() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    void interact() {
        System.out.println("Кошка играет");
    }
}
