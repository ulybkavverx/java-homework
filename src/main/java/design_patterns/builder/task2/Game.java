package design_patterns.builder.task2;

public class Game {

    public Character createWarrior() {
        return new CharacterBuilder()
                .setHealth(150)
                .setDamage(100)
                .setArmor(200)
                .setMagic(10)
                .build();
    }

    public Character createMage() {
        return new CharacterBuilder()
                .setHealth(60)
                .setDamage(40)
                .setArmor(20)
                .setMagic(200)
                .build();
    }
}
