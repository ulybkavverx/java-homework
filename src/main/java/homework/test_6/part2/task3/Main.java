package homework.test_6.part2.task3;

public class Main {
    public static void main(String[] args) {
        StoringKeysAndValues task1 = new StoringKeysAndValues();

        task1.addKeysAndValues();
        task1.getValueByKey("Общие настройки");

        task1.checkForExistence("Главный экран");
        task1.checkForExistence("Безопасность");
    }
}
