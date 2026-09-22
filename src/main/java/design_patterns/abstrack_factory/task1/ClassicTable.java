package design_patterns.abstrack_factory.task1;

public class ClassicTable implements Table {

    @Override
    public void use() {
        System.out.println("Используем классический стол");
    }
}
