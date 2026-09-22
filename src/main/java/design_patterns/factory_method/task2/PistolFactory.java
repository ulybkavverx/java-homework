package design_patterns.factory_method.task2;

public class PistolFactory extends WeaponFactory {

    @Override
    public Weapon createWeapon() {
        return new Pistol();
    }
}
