package design_patterns.abstrack_factory.task2;

public class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("Нажата кнопка MacOS");
    }
}
