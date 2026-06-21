package practice_java.practice_5.test;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private List<Product> products;
    private List<Discountable> discounts;

    public Order() {
        this.products = new LinkedList<>();
        this.discounts = new LinkedList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(List<Product> products) {
        products.addAll(products);
    }

    public void addDiscount(Discountable discountable) {
        discounts.add(discountable);
    }

    public void addDiscounts(List<Discountable> discounts) {
        discounts.addAll(discounts);
    }


}
