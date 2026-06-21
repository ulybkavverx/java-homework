package practice_java.practice_5.test;

public class PhysicalProduct extends Product {
    private int weight;

    public PhysicalProduct(String title, int price, int weight) {
        super(title, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
