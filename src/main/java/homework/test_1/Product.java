package homework.test_1;

public class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }
    int getPrice() {
        return this.price;
    }

    void setPrice(int newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(int discount) {
        price = price - (price * discount / 100);
    }

    void printInfo() {
        System.out.println("Товар: " + this.name + ", цена: " + this.price);
    }
}
