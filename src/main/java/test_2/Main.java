package test_2;

public class Main {
    public static void main(String[] args) {
        Company petya = new Company(1, "Петя");
        Company kolya = new Company(2, "Коля");

        Company.printCompanyName();
        Company.companyName = "Inner";
        Company.printCompanyName();


        double result = MathConstants.calculateCircleArea(3.6);
        System.out.println("Площадь круга: " + result);

        double result1 = MathConstants.calculateCircumference(5.9);
        System.out.println("Длина окружности: " + result1);

        double result2 = MathConstants.calculateExponentialGrowth(1.3, 5.7, 6.6);
        System.out.println("Расчет экспоненциального роста: " + result2);


        University egor = new University(1, "Egor");
        University olga = new University(2, "Olga");
        University denis = new University(3, "Denis");

        University.changeUniversityName("КТиГС");
        egor.printStudentInfo();
        olga.printStudentInfo();
        denis.printStudentInfo();

        GameSettings soccer = new GameSettings("Футбол", 20);
        GameSettings volleyball = new GameSettings("Волейбол", 12);


        GameSettings.setMaxPlayers(30);
        volleyball.addPlayer();
        soccer.addPlayer();

        volleyball.printGameStatus();
        soccer.printGameStatus();

        Person ivan = new Person("Иван", "Иванов", "123-45-6789");
        Person rita = new Person("Рита", "Ритовна", "321-54-5632");

        ivan.setFirstName("Михаил");
        ivan.printPersonInfo();
        rita.printPersonInfo();
    }
}
