package test_4.solvers;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
      // divisibleBy3();

       // System.out.println("Сумма всех чисел от 1 до n: " + sumOfNumbersFrom1ToN());

       // multiplicationTable();

       // primeNumberCheck();

        printNumberFrom1To10();

    }
    // метод для вывода чисел от 1 до 100, которые делятся на 3
    public static void divisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    // метод для подсчета суммы всех чисел от 1 до n
    public static int sumOfNumbersFrom1ToN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // метод для создания таблицы умножения числа
    public static void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 10: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) { // n - 3 фикс знач
            System.out.println(n + " * " + i + " = " + (n * i)); // n * i = n * i
        }
    }

    // метод для проверки на простое число
    public static void primeNumberCheck() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();


        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) { // 2 простое 4 не простое число
                if (number % i == 0) {
                    isPrime = false;
                    break;
        }
        }
        if (isPrime) {
            System.out.println("Число простое");
        }else {
            System.out.println("Число не является простым");
        }
     }
    }

    // метод для вывода чисел от 1 до 10
    public static void printNumberFrom1To10() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}