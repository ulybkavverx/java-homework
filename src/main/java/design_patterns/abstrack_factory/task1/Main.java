package design_patterns.abstrack_factory.task1;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();

        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        modernChair.sitOn();
        modernTable.use();

        FurnitureFactory classicFactory = new ClassicFurnitureFactory();

        Chair classicChair = classicFactory.createChair();
        Table classicTable = classicFactory.createTable();

        classicChair.sitOn();
        classicTable.use();
    }
}
