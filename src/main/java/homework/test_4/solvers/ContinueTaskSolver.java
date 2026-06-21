package homework.test_4.solvers;

import java.util.Scanner;

public class ContinueTaskSolver {
    public static void main(String[] args) {
        //skipNumbersDivideBy3();
        printOnlyPositiveNumbers();
    }
    // метод для пропуска чисел которые делятся на 3
    public static void skipNumbersDivideBy3() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    // метод для вывода положительных чисел
    public static void printOnlyPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        while (true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();

            if (number < 0) {
                continue;
            }

            System.out.print(number);
            break; // добавлена команда break
        }
    }
}
