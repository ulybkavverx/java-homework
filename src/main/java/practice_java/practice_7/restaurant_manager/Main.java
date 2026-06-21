package practice_java.practice_7.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addNewOrder("Картошка фри");
        manager.addNewOrder("Спагетти");
        manager.addNewOrder("Суп");
        manager.addNewOrder("Салат настольный");
        manager.printOrders();

        manager.deleteOrder("Суп");
        manager.printOrders();
    }
}
