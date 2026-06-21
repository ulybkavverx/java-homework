package homework.test_5.botanical_garden;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void providingCareForPlant() {
        plant.care();
    }
}
