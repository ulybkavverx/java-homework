package homework.test_5.aquarium;

public class Aquarium {
    private SeaCreature seaCreature;

    public void setSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    public void showMovement() {
        this.seaCreature.move();
    }
}
