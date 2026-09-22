package design_patterns.factory_method.task1;

public abstract class TransportFactory {

    // фабричный метод
    public abstract Transport createTransport();

    //
    public void deliver() {
        Transport transport = createTransport();
        transport.drive();
    }
}
