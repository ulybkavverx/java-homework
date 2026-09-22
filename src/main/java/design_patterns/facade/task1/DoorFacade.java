package design_patterns.facade.task1;

public class DoorFacade {
    private DoorOpen doorOpen;
    private DoorClose doorClose;
    private DoorLock doorLock;

    public DoorFacade() {
        doorOpen = new DoorOpen();
        doorClose = new DoorClose();
        doorLock = new DoorLock();
    }

    public void openDoor() {
        doorOpen.open();
    }

    public void closeDoor() {
        doorClose.close();
    }

    public void lockDoor() {
        doorLock.lock();
    }
}
