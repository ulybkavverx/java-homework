package homework.test_6.part2.task3;

import java.util.HashMap;

public class StoringKeysAndValues {
    private HashMap<String, String> keysValues;

    public StoringKeysAndValues() {this.keysValues = new HashMap<>();}

    public void addKeysAndValues() {
        keysValues.put("Главный экран", "Ярлыки приложения");
        keysValues.put("Общие настройки", "Язык и клавиатура");
        keysValues.put("Обновление ПО", "Загрузка и установка");
    }

    // получить значение по ключу
    public void getValueByKey(String name) {
        System.out.println(keysValues.get(name));
    }

    // проверка существования параметра по ключу
    public void checkForExistence(String name) {
       if (keysValues.containsKey(name)) {
           System.out.println("Параметр: " +  name + " есть в приложении");
       } else {
           System.out.println("Параметр: " + name + " отсутствует в приложении");
       }
    }
}
