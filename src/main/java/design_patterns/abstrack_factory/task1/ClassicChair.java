package design_patterns.abstrack_factory.task1;

public class ClassicChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Сидим на классическом стуле");
    }
}
