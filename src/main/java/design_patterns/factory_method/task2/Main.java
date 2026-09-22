package design_patterns.factory_method.task2;

public class Main {
    public static void main(String[] args) {
        WeaponFactory sword = new SwordFactory();
        sword.useWeapon();

        WeaponFactory bow = new BowFactory();
        bow.useWeapon();

        WeaponFactory pistol = new PistolFactory();
        pistol.useWeapon();
    }
}
