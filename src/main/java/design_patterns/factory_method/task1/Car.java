package design_patterns.factory_method.task1;

public class Car implements Transport {

    @Override
    public void drive() {
        System.out.println("Машина едет");
    }
}
