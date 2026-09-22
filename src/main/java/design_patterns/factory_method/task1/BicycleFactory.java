package design_patterns.factory_method.task1;

public class BicycleFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
