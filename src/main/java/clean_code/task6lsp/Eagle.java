package clean_code.task6lsp;

public class Eagle extends Bird implements  FlyingBird {
    @Override
    public void fly() {
        System.out.println("Орел летит");
    }
}
