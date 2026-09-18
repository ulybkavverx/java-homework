package clean_code.task4srp;

//Нарушение SRP (Single Responsibility Principle) – класс выполняет несколько задач
//Задача: Разделите класс Order на отдельные классы, каждый из которых выполняет только одну задачу.

public class Order {

    public void processOrder() {
        System.out.println("Обрабатываем заказ...");
    }
}
