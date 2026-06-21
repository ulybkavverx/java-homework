package homework.test_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
       // System.out.println("Факториал: " + factorialNumber());

       // allEvenNumbersToSpecificNum();

       countdownFromEnteredNumTo1();
    }
    public static int factorialNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int result = 1;
        int i = 1;

        while (i <= n) { // i = 1, n = 2 -> i = 2, n = 2
            result = result * i; // 1 = 1 * 2 = 2 -> 2 * 2 = 4 // исправлено с n на i
            i++; // 1 + 1 = 2 -> 2 + 1 = 3
        }
        return result;
    }

    // метод для вывода всех четных чисел до заданного
    public static void allEvenNumbersToSpecificNum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int i = 1;

        while (i <= number) { // i = 1 number = 4 -> i == 2 -> i == 3 num == 4, i == 4, num == 4
            if (i % 2 == 0) { // 1 / 2 -> 2 / 2 = 1
                System.out.println(i); // 2 4
            }
            i++; // 1 + 1 = 2 -> 2 + 1 = 3 -> 3 + 1 = 4
        }
    }

    // метод для обратного отсчета от введенного число до 1
    public static void countdownFromEnteredNumTo1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное число: ");
        int number = scanner.nextInt(); // 3

        while (number > 0) { // 3 >= 1 = true
            System.out.println(number);
            number--; // 3 - 1 = 2
        }
    }
}
