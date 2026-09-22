package design_patterns.factory_method.task2;

public class Pistol implements Weapon {

    @Override
    public void attack() {
        System.out.println("Выстрел из пистолета");
    }
}
