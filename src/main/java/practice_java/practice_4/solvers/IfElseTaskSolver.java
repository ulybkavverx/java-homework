package practice_java.practice_4.solvers;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        // проверка метода четности
        System.out.println(checkParity(4));
        System.out.println(checkParity(7));

        // проверка метода определения возраста
        System.out.println(chechAge(4));
        System.out.println(chechAge(21));
        System.out.println(chechAge(71));

        // проверка метода по нахождению максимального среди трех чисел
        System.out.println(checkMax(3,7,5));
    }



    /**
     * Метод для проверки четности числа number
     * @param number
     * @return
     */
    public static String checkParity(int number) {
        // if - else
        // в методе должен быть один return

        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    /**
     * Метод для определения возраста
     * @param age
     * @return
     */
    public static String chechAge(int age) {
        String ageDescription = "";
        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            ageDescription = "Взрослый";
        }
        if (age > 60) {
            ageDescription = "Пожилой";
        }
        return ageDescription;
    }


    /**
     * Метод для определения наибольшего числа
     * @param a
     * @param b
     * @param c
     */
    public static int checkMax(int a, int b, int c) {
        int maxAB = b;

        if (a > b) {
            maxAB = a;
        }

        int max = maxAB;

        if (c > maxAB) {
            maxAB = c;
        }
        return max;
    }
}
