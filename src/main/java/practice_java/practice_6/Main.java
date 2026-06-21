package practice_java.practice_6;

public class Main {
    public static void main(String[] args) {
        Person petr = new Person("Petr", 25);

        // значение toString по умолчанию
        System.out.println(petr.toString());

        // сравнение объектов
        // примитивные типы данных сравниваются через ==
        // ссылочные типы данных сравниваются через equals
        Person petr2 = new Person("Petr", 25);

        System.out.println(petr.equals(petr2));

        // клонирование
        Person clonePetr = petr.clone();
        System.out.println(clonePetr);

        System.out.println(petr.getClass());
    }
}
