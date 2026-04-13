package test_4.solvers;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
       // System.out.println(checkSignNumber());

       // System.out.println(findMaxOfTwoNumbers());

       // System.out.println(printGradeFrom1To5());

       // System.out.println(checkParity());

       // System.out.println(ageDiscount());

        System.out.println(ratingPoints());
    }

    // метод для определения знака числа
    public static String checkSignNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        String signNumber = "";

        if (number > 0) {
            signNumber = "Число положительное";
        } else if (number < 0) {
            signNumber = "Число отрицательное";
        } else {
            signNumber = "Число равно нулю";
        }
        return signNumber;
    }

    // метод для поиска наибольшего из двух чисел
        public static String findMaxOfTwoNumbers() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();

            int max = 0;

            if (number1 > number2) {
                max = number1;
            } else {
                max = number2;
            }
            return ("Наибольшее число из двух: " + max);
        }

        // метод вывода оценки по шкале от 1 до 5
        public static String printGradeFrom1To5() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число от 1 до 5: ");
            int number = scanner.nextInt();

            String descriptionGrade = "";

            if (number == 5) {
                descriptionGrade = "Отлично";
            } else if (number == 4) {
                descriptionGrade = "Хорошо";
            } else if (number == 3) {
                descriptionGrade = "Удовлетворительно";
            } else if (number == 2 || number == 1) {
                descriptionGrade = "Неудовлетворительно";
            } else {
                descriptionGrade = "Оценка неопознана";
            }
            return descriptionGrade;
        }

        // метод для проверки на четность
        public static String checkParity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();


        String resultParity = "";

        if (number % 2 == 0) {
            resultParity = "Четное";
        } else {
            resultParity = "Нечетное";
        }
        return resultParity;
    }

    // метод по определению скидки по возрасту
    public static String ageDiscount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        String discount = "";

        // с 19 до 64 без скидки
        if (age <= 18) {
            discount = "Скидка 25%";
        } else if (age >= 65) {
            discount = "Скидка 30%";
        } else {
            discount = "Без скидки";
        }
        return discount;
    }

    // метод оценки результата по баллам
    public static String ratingPoints() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 0 до 100: ");
        int number = scanner.nextInt();

        String grade = "";

        if (number >= 90) {
            grade = "Отлично";
        } else if (number >= 75) {
            grade = "Хорошо";
        } else if (number >= 60) {
            grade = "Удовлетворительно";
        } else {
            grade = "Неудовлетворительно";
        }
        return grade;
    }
}
