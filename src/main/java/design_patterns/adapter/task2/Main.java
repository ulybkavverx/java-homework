package design_patterns.adapter.task2;

public class Main {
    public static void main(String[] args) {
        //километры
        Distance kilometers = new Kilometers(10);

        System.out.println("Километры: " + kilometers.getDistance());

        //мили
        Miles miles = new Miles(10);

        //адаптер для преображения милей в километры
        Distance adapter = new MilesToKilometersAdapter(miles);

        System.out.println("Мили в километрах: " + adapter.getDistance());
    }
}
