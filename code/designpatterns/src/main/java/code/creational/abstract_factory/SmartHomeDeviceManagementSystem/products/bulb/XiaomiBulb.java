package code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb;

public class XiaomiBulb implements Bulb {

    @Override
    public void lightsOn() {
        System.out.println("Xiaomi bulb is ON");
    }

    @Override
    public void lightsOff() {
        System.out.println("Xiaomi bulb is OFF");
    }

}
