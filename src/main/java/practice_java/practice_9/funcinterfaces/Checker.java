package practice_java.practice_9.funcinterfaces;

@FunctionalInterface
public interface Checker {
    // интерфейс проверяет, удовлетворяет ли число условию
    // метод по умолчанию печатает число, если оно проходит проверку

    boolean check(int number);

    default void printIfValid(int number) {
        if (check(number)) {
            System.out.println(number);
        }
    }
}
