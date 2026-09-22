package design_patterns.builder.task1;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Order order = shop.createOrder();

        order.showOrder();
    }
}
