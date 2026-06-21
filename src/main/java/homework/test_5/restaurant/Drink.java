package homework.test_5.restaurant;

public class Drink implements Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public void getDescription() {
        System.out.println("Напиток, объем: " + this.volume);
    }
}
