package design_patterns.builder.task2;

public class Character {
    private int health;
    private int damage;
    private int armor;
    private int magic;

    public Character(int health, int damage, int armor, int magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }

    public void showCharacter() {
        System.out.println("Здоровье: " + health);
        System.out.println("Урон: " + damage);
        System.out.println("Броня: " + armor);
        System.out.println("Магия: " + magic);
    }
}
