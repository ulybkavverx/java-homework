package test_4.solvers;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
       // System.out.println(dayOfWeek());

       // System.out.println(ticketPriceDayOfWeek());

        //System.out.println(conversionNumbersGradesLetters());

        //System.out.println(textCommandProcessing());

        System.out.println(calculator());

    }
    // метод вывода по дням недели
    public static String dayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int day = scanner.nextInt();

        String dayWeek = "";

        switch (day) {
            case 1:
                dayWeek = "Понедельник";
                break;
            case 2:
                dayWeek = "Вторник";
                break;
            case 3:
                dayWeek = "Среда";
                break;
            case 4:
                dayWeek = "Четверг";
                break;
            case 5:
                dayWeek = "Пятница";
                break;
            case 6:
                dayWeek = "Суботта";
                break;
            case 7:
                dayWeek = "Воскресенье";
                break;
            default:
                dayWeek = "Неопределенный день";
        }
        return dayWeek;
    }

    // метод для проверки стоимости билета по дню недели
    public static String ticketPriceDayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int day = scanner.nextInt();

        String result = "";

        switch (day) {
            case 1, 2, 3, 4, 5:
                result = "Стоимость билета 300 рублей";
                break;
            case 6, 7:
                result = "Стоимости билета 400 рублей";
            default:
                result = "Билет не найден";
        }
        return result;
    }

    // метод для перевода числовых оценок в буквенные
    public static String conversionNumbersGradesLetters() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 0 до 100: ");
        int grade = scanner.nextInt();

        String result = "";

        if (grade >= 90 && grade <= 100) {
            result = "A";
        } else if (grade >= 80 && grade <= 89) {
            result = "B";
        } else if (grade >= 70 && grade <= 79) {
            result = "C";
        } else if (grade >= 60 && grade <= 69) {
            result = "D";
        } else if (grade < 60){
            result = "F";
        } else {
            result = "unknown";
        }
        return result;
    }

    // метод по обработке текстовых команд
    public static String textCommandProcessing() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        String result = "";

        switch (command) {
            case "start":
                result = "Программа запущена";
                break;
            case "stop":
                result = "Программа остановлена";
                break;
            case "restart":
                result = "Программа перезапущена";
                break;
            case "status":
                result = "Статус программы";
                break;
            default:
                result = "Неверная комманда";
                break;
        }
        return result;
    }

    // метод использования калькулятора
    public static double calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Нельзя делить на ноль");
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("Неизвестный оператор");
        }
        return result;
    }
}
