package design_patterns.singleton.task1;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();

        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println(config1.getDataBaseUrl());

        System.out.println(config1 == config2);
    }
}
