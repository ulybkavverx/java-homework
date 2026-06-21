package practice_java.practice_3;

public class Main {
    public static void main(String[] args) {
        // создали переменную
        // присвоили переменной экземпляр класса Student
        // вызвав дефолтный конструктор
        System.out.println(Student.studentCount);

        Student petya = new Student(18, "Петя");
        System.out.println(Student.studentCount);

        Student kolya = new Student(20, "Коля");
        System.out.println(Student.studentCount);


        System.out.println(petya.age); // нестатическое поле age
        System.out.println(kolya.age); // нестатическое поле age

        System.out.println(Student.MAX_YEARS); // статическое поле maxYears (привязано к классу, а не к объекту)

        Student.printMaxYears(); // не нужно обращаться к объекту, обращаемся через класс Student, тк вызываем статический метод

    }
}
