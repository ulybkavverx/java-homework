package homework.test_5.pet_management;

public class PetManager {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void handlePet() {
        this.pet.feed();
        this.pet.interact();
    }
}
