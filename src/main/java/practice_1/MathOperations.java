package practice_1;

public class MathOperations {

    public static void main(String[] args) {
       int add1 = add(5,10);
       System.out.println("Результат суммы двух чисел: " + add1);

        int sub1 = subtract(10,5);
        System.out.println("Результат разницы двух чисел: " + sub1);

        int mult1 = multiply(2,6);
        System.out.println("Результат произведения двух чисел: " + mult1);

        double div1 = divide(5,3);
        System.out.println("Результат деления двух чисел: " + div1);

        int number = findMax(5,9);
        System.out.println("Большее число: " + number);

        int dif1 = difference(1,5);
        System.out.println("Модуль разности двух чисел: " + dif1);

        int area1 = squareArea(5);
        System.out.println("Площадь квадрата: " + area1);
        int per1 = squarePerimeter(5);
        System.out.println("Периметр квадрата: " + per1);

        double sec1 = convertSecondsToMinutes(120);
        System.out.println("Количество минут: " + sec1);

        double avg1 = averageSpeed(100.20, 63.55);
        System.out.println("Средняя скорость: " + avg1);

        double hyp1 = findHypotenuse(2.3, 6.7);
        System.out.println("Гипотенуза равна: " + hyp1);

        double cir1 = circleCircumference(2.3);
        System.out.println("Длина окружности: " + cir1);

        double pers1 = calculatePercentage(3.6, 6.2);
        System.out.println("Процент от общего составляет: " + pers1);

        double fah1 = celsiusToFahrenheit(26.6);
        System.out.println("Цельсий в Фаренгейты: " + fah1);
        double cel1 = fahrenheitToCelsius(100.3);
        System.out.println("Фаренгейт в Цельсий: " + cel1);
    }

    // 1. Напишите класс
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }


    // 2. Реализуйте метод для нахождения максимума двух чисел
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // 3. Метод для нахождения разницы между двумя числами
    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    // 4. Методы для площади и периметра квадрата
    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    // 5. Метод для перевода секунд в минуты
    public static double convertSecondsToMinutes(int second) {
        return second / 60.00;
    }

    // 6. Метод для вычисления средней скорости
    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    // 7. Метод для нахождения гипотенузы
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    // 8. Метод для длины окружности
    public static double circleCircumference(double radius) {
        return Math.PI * 2 * radius;
    }

    // 9. Метод для вычисления процентов
    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    // 10. Методы перевода температуры
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}