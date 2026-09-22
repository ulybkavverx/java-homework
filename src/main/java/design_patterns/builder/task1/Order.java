package design_patterns.builder.task1;

import java.util.List;

public class Order {
    private List<String> products;
    private double discount;
    private String payMethod;

    public Order(List<String> products, double discount, String payMethod) {
        this.products = products;
        this.discount = discount;
        this.payMethod = payMethod;
    }

    public void showOrder() {
        System.out.println("Товары: " + products);
        System.out.println("Скидка: " + discount + "%");
        System.out.println("Способ оплаты: " + payMethod);
    }
}
