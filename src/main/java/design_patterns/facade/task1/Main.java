package design_patterns.facade.task1;

public class Main {
    public static void main(String[] args) {
        DoorFacade door = new DoorFacade();

        door.openDoor();
        door.closeDoor();
        door.lockDoor();
    }
}
