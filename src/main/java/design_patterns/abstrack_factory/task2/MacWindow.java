package design_patterns.abstrack_factory.task2;

public class MacWindow implements Window{

    @Override
    public void draw() {
        System.out.println("Отображается окно MacOS");
    }
}
