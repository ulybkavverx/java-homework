package design_patterns.facade.task2;

public class SmartHouseFacade {
    private Light light;
    private AirConditioner airConditioner;
    private SecuritySystem securitySystem;

    public SmartHouseFacade() {
        light = new Light();
        airConditioner = new AirConditioner();
        securitySystem = new SecuritySystem();
    }

    public void turnOnEverything() {
        light.turnOn();
        airConditioner.turnOn();
        securitySystem.turnOn();
    }

    public void turnOffEverything() {
        light.turnOff();
        airConditioner.turnOff();
        securitySystem.turnOff();
    }
}
