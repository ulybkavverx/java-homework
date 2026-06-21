package homework.test_5.restaurant;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
    }

    public void printMenu() {
        dish.getDescription();
    }
}
