package design_patterns.factory_method.task1;

public class Main {
    public static void main(String[] args) {
        TransportFactory car = new CarFactory();
        car.deliver();

        TransportFactory bicycle = new BicycleFactory();
        bicycle.deliver();
    }
}
