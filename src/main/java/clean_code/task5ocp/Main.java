package clean_code.task5ocp;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment(new CreditCardPayment(), 1000);
        paymentProcessor.processPayment(new PayPalMethod(), 1500);
        paymentProcessor.processPayment(new BitcoinPayment(), 10000);
    }
}
