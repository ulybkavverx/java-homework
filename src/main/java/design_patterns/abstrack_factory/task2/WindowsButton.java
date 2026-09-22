package design_patterns.abstrack_factory.task2;

public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Нажата кнопка Windows");
    }
}
