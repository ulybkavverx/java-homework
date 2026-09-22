package design_patterns.builder.task2;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Character warrior = game.createWarrior();
        warrior.showCharacter();

        Character mage = game.createMage();
        mage.showCharacter();
    }
}
