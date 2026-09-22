package design_patterns.factory_method.task2;

public abstract class WeaponFactory {

    // фабричный метод
    public abstract Weapon createWeapon();

    public void useWeapon() {
        Weapon weapon = createWeapon();
        weapon.attack();
    }
}
