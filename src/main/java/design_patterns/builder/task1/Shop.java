package design_patterns.builder.task1;

public class Shop {
    public Order createOrder() {
        return new OrderBuilder()
                .addProduct("Ноутбук")
                .addProduct("Клавиатура")
                .addProduct("Мышь")
                .useDiscount(5)
                .setPayMethod("Банковская карта")
                .build();
    }
}
