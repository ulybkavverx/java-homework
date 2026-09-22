package design_patterns.singleton.task1;

/**
 * Реализовать Singleton для управления конфигурацией приложения
 */
public class ConfigurationManager {
    //единственный экземпляр
    private static ConfigurationManager instance;

    // настройки приложения
    private String dataBaseUrl;
    private String userName;
    private String password;
    private String pathToFolder;
    private String logLevel;
    private String pathLog;

    // приватный конструктор, нельзя создать экземпляры из вне
    private ConfigurationManager() {
        dataBaseUrl = "url:dataBase123";
        userName = "admin";
        password = "password";
        pathToFolder = "/files";
        logLevel = "Info";
        pathLog = "path_log";
    }

    // метод для получения единственного экземпляра
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getPathToFolder() {
        return pathToFolder;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getPathLog() {
        return pathLog;
    }
}
