package practice_java.practice_5.task_1;

public abstract class Transport {
    private double speed; // поле скорость // км/ч
    private int capacity; // поле вместимость // в метр в кубе в 3 степени

    public Transport(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public double getSpeed() { // доступ к полю speed только для чтения
        return this.speed;
    }

    public int getCapacity() { // доступ к полю capacity только для чтения
        return this.capacity;
    }

    abstract void start(); // абстрактный метод
}
