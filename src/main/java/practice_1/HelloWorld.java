package practice_1;

public class HelloWorld {
    // поля
    static int a = 1;



    // метод
    // метод main - точка входа
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Это Влада!");

        System.out.println(2 + 5);
        System.out.println(2 * 5);

        System.out.println("В поле а хранится: " + a);

        int sum1 = sum(1000,2000);
        System.out.println("Результат сложения: " + sum1);

        int mult1 = multiply(3,2);
        System.out.println("Результат умножения: " + mult1);

        int sub1 = substruct(10,3);
        System.out.println("Результат вычитания: " + sub1);

        double div1 = divide(3,2);
        System.out.println("Результат деления: " + div1 );


    }

    public static int sum(int x, int y) {
        // тело метода
        return x + y; // возвращаемое значение из метода
    }

    public static int multiply(int a, int b) { // аргументы метода
        // тело метода
        int mult = a * b; // создание переменной, присвоили значение равное результату умножения a и b

        return mult;
    }

    public static int substruct(int i, int s) {
        return i - s;
    }

    // возвращаемый тип данных - целое или нет?
    public static double divide(int e, int x) {
        return (double) e / x;
    }
}
