package test_4.solvers;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // System.out.println("Вы ввели положительное число: " + askPositiveNumber());
        //System.out.println("Доступ разрешен! Пароль верный: " + checkPassword());
        //printNumbersFrom1To10();
       // System.out.println("Завершение программы! Команда: " + commandExit());
        System.out.println(countNumberOfDigits());

    }
    // метод для запроса положительных чисел
    public static int askPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Введите число: "); // -1
            number = scanner.nextInt(); // -1
        } while (number <= 0); // number == -1 <= 0 true

        return number;
    }

    // метод для проверки пароля
    public static String checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String password = "";

        do {
            System.out.print("Введите пароль: "); // admin
            password = scanner.nextLine(); // admin
        } while (!password.equals("123"));

        return password;
    }

    // метод для вывода чисел от 1 до 10
    public static void printNumbersFrom1To10() {

        int i = 1;

        do {
            System.out.println(i); // i == 1
            i++; // 1 + 1 = 2
        } while (i <= 10);
    }

    // метод по завершению программы по команде "exit"
    public static String commandExit() {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        do {
            System.out.print("Введите команду: "); // hello
            command = scanner.nextLine(); // hello
        } while (!command.equals("exit"));

        return command;
    }

    // метод для подсчета кол-ва цифр в числе
    public static int countNumberOfDigits() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: "); // 30
        int number = scanner.nextInt();

        int count = 0;

        do {
            number = number / 10; // 30 / 10
            count++;
        } while (number != 0);

        return count;
    }
}
