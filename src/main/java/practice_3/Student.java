package practice_3;

public class Student {
    final static int MAX_YEARS = 11; // статическое поле (привязано к классу) => Student.maxYears
    static int studentCount;

    static { // статический блок // вместо static int maxYears = 11; => мы сделали это через стат блок static{}
        studentCount = 0;
    }

    int age; // нестатическое поле age
    String name; // нестатическое поле name

    Student(int someAge, String someName) { // конструктор, создание объектов
        this.age = someAge;
        this.name = someName;
        studentCount++; // инкремент, увелечение значения на 1
    }

     int getAge() { // геттер для поля age
        return this.age; // вернуть значение поля age у конктретного объекта
    }
    static void printMaxYears() { // статический метод, который может вызывать только статическое поле или методы
         System.out.println(MAX_YEARS); // статик
    }
}
