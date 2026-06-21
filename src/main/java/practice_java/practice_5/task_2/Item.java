package practice_java.practice_5.task_2;

public class Item implements Printable {
    private String name;
    private double price;
    private int count;

    public Item (String name, double price, int count) { // конструктор
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void print() { // интерфейс с телом
        System.out.println("Мой товар: имя " + this.name + ", цена " + this.price + ", кол-во на складе: " + this.count);
    }
}
