package homework.test_5.restaurant;

public class HotDish implements Dish {
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void getDescription() {
        System.out.println("Горячее блюдо, температура: " + this.temperature);
    }
}
