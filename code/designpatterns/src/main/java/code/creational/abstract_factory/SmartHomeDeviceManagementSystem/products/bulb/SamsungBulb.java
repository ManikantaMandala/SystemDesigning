package code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb;

public class SamsungBulb implements Bulb {

    @Override
    public void lightsOn() {
        System.out.println("Samsung bulb is ON");
    }

    @Override
    public void lightsOff() {
        System.out.println("Samsung bulb is OFF");
    }

}
