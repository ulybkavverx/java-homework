package design_patterns.factory_method.task2;

public class BowFactory extends WeaponFactory {

    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}
