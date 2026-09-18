package clean_code.task5ocp;

//Нарушение OCP (Open/Closed Principle) – закрытый для расширения код
//Задача: Избавьтесь от if-else, применив полиморфизм (наследование или интерфейсы).

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
       paymentMethod.pay(amount);
    }
}
