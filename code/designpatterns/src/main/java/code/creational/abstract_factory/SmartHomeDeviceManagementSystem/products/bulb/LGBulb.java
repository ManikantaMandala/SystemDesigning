package code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb;

public class LGBulb implements Bulb {

    @Override
    public void lightsOn() {
        System.out.println("LG bulb is ON");
    }

    @Override
    public void lightsOff() {
        System.out.println("LG bulb is OFF");
    }

}
