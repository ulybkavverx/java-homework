package practice_java.practice_1;

public class UserInfo { // определение класса
    private static final String DEFAULT_NAME = "unknown";
    private String name; // объявление поля класса с типом данных String и именем name
    private int age;

    public void printInfo() {
        System.out.println("Имя: " + name); //  передаю аргумент "Имя"  И + конкатенирую с полем name
        System.out.println("Возраст: " + age); // вызов распечатывани в консоль с новой строки с аргументом "Возраст: ", контенированное с полем age
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) { // определение метода main (точка входа)
        UserInfo userInfo = new UserInfo();

        userInfo.setName("Ольга");

        userInfo.setAge(22);

        userInfo.printInfo();

    }
}
