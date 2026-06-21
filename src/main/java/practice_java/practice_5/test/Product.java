package practice_java.practice_5.test;

public abstract class Product { // абстрактный класс, тк не можем создавать сущность продукта отдельно
    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // геттеры для полей - просмотра
    // сеттеры не нужны, если поля не будут меняться

    public String getTitle() {
        return title;
    }
    public int getPrice() {
        return price;
    }
}
