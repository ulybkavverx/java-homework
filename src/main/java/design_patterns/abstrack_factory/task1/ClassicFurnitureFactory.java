package design_patterns.abstrack_factory.task1;

public class ClassicFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
