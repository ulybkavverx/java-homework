package homework.test_1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 2000);

        car1.setYear(2010);
        car1.print();


        Rectangle rectangle1 = new Rectangle(20, 30);
        rectangle1.setWidth(25);

        System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea());


        Book book1 = new Book("Зеленая миля", "Стивен Кинг");

        book1.setAuthor("Лев Толстой");
        book1.printInfo();

        BankAccount bankAccount1 = new BankAccount("Роман", 100);
        bankAccount1.deposit(200);
        bankAccount1.withdraw(150);
        bankAccount1.printBalance();

        Point point1 = new Point(12.36, 15.68);
        point1.setX(10.00);
        point1.print();

        StudentGroup studentGroup1 = new StudentGroup("Группа А", 100);
        studentGroup1.setStudentCount(150);
        studentGroup1.printInfo();


        Circle circle1 = new Circle(5.30);
        circle1.setRadius(5.00);
        System.out.println("Площадь круга: " + circle1.calculateArea() + ", длина окружности: " + circle1.calculateCircumference());



        Teacher teacher1 = new Teacher("Людмила", "Математика");
        teacher1.setSubject("Русский язык");
        teacher1.printInfo();

        Product product1 = new Product("Морковь", 40);
        product1.setPrice(30);
        product1.applyDiscount(10);
        product1.printInfo();


        Laptop laptop1 = new Laptop("Aero", 250_000);
        laptop1.setPrice(200_000);
        laptop1.printInfo();
    }
}
