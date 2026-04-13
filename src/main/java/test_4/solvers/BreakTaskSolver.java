package test_4.solvers;

import java.util.Scanner;

public class BreakTaskSolver {
    public static void main(String[] args) {
        //System.out.println(sumToFirstNegative());
        printBeforeCommandStop();
    }
    // метод для подсчета суммы чисел до первого отрицательного
    public static int sumToFirstNegative() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
        }
        return sum;
    }

    // метод для ввода строк до команды "stop"
    public static void printBeforeCommandStop() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
        }
        System.out.println("Программа завершена!");
    }
}
