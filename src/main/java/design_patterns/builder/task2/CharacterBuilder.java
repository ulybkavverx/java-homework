package design_patterns.builder.task2;

public class CharacterBuilder {
    private int health;
    private int damage;
    private int armor;
    private int magic;

    public CharacterBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public CharacterBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    public CharacterBuilder setArmor(int armor) {
        this.armor = armor;
        return this;
    }

    public CharacterBuilder setMagic(int magic) {
        this.magic = magic;
        return this;
    }

    public Character build() {
        return new Character(health, damage, armor, magic);
    }
}
