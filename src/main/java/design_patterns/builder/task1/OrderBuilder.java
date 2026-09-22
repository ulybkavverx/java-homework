package design_patterns.builder.task1;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private List<String> products = new ArrayList<>();
    private double discount;
    private String payMethod;

    // добавляем товар
    public OrderBuilder addProduct(String product) {
        products.add(product);
        return this;
    }

    //применяем скидку
    public OrderBuilder useDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    //выбираем способ оплаты
    public OrderBuilder setPayMethod(String payMethod) {
        this.payMethod = payMethod;
        return this;
    }

    // создаем готовый объект
    public Order build() {
        return new Order(products, discount, payMethod);
    }
}
