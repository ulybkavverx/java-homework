package design_patterns.singleton.task2;

/**
 * Реализовать Singleton для менеджера логирования (Logger)
 */

public class Logger {
    // единственный экземпляр Logger
    private static Logger instance;

    // приватный конструктор
    private Logger() {
    }

    // получение единственного экземпляра
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    //Запись информации о событиях
    public void info(String message) {
        System.out.println("Info: " + message);
    }

    //Запись ошибок
    public void error(String message) {
        System.out.println("Error: " + message);
    }

    // Запись предупреждений
    public void warning(String message) {
        System.out.println("Warning: " + message);
    }
}
