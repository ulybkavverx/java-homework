package practice_java.practice_5.task_1;

public class Ship extends Transport {
    public Ship() {
        super(40, 5_000);
    }

    @Override
    public void start() {
        System.out.println("Корабль поплыл");
    }
}
