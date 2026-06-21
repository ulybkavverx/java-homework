package homework.test_5.zoo;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showAnimalBehavior() {
        this.animal.makeSound();
        this.animal.move();
    }
}
