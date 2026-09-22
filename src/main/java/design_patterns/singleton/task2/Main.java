package design_patterns.singleton.task2;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.info("Успешное подключение к базе данных");
        logger.error("Ошибка при выполнении операции");
        logger.warning("Используется устаревший метод");
    }
}
