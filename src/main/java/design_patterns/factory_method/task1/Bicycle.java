package design_patterns.factory_method.task1;

public class Bicycle implements Transport {
    @Override
    public void drive() {
        System.out.println("Велосипед едет");
    }
}
