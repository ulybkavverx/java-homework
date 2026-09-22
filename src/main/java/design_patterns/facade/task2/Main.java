package design_patterns.facade.task2;

public class Main {
    public static void main(String[] args) {
        SmartHouseFacade smartHouse = new SmartHouseFacade();

        smartHouse.turnOnEverything();

        System.out.println();

        smartHouse.turnOffEverything();
    }
}
