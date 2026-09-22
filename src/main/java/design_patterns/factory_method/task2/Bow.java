package design_patterns.factory_method.task2;

public class Bow implements Weapon {

    @Override
    public void attack() {
        System.out.println("Выстрел из лука");
    }
}
