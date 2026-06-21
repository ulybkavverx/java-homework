package homework.test_5.farm;

public class Farm {
    private FarmAnimal farmAnimal;


    public void setFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
    }

    public void serviceAnimal() {
        farmAnimal.produce();
        farmAnimal.care();
        farmAnimal.feed();
    }
}
