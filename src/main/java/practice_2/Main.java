package practice_2;


public class Main {
    public static void main(String[] args) {
        // проверка конструктора по умолчанию
        Student petya = new Student(18, "Petya");   // Student - тип данных  petya - имя

        petya.print();

        Student kolya = new Student(20, "Kolya");

        kolya.print();

        petya.setName("Антон");
        petya.name = "Антон";
        petya.print();

        kolya.setAge(21);
        kolya.age = 21;
        kolya.print();

        // дебаггинг или дебаг - точка ОСТАНОВА
    }
}
