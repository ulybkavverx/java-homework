package practice_java.practice_5.task_2;

public class Main {
    public static void main(String[] args) {
        Item mug = new Item("Кружка", 100, 2);
        Item microphon = new Electronics("Микрофон", 10_000, 1);
        Item dress = new Clothes("Платье", 5_000, 3);

        Manager kostya = new Manager();

        kostya.manage(mug);
        kostya.manage(microphon);
        kostya.manage(dress);
    }
}
