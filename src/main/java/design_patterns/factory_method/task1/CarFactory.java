package design_patterns.factory_method.task1;

public class CarFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
