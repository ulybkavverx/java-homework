package clean_code.task5ocp;

public class PayPalMethod implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
