package code.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer;

public class SamsungFreezer implements Freezer {

    @Override
    public void openDoor() {
        System.out.println("Samsung Freezer door is opened");
    }

    @Override
    public void closeDoor() {
        System.out.println("Samsung Freezer door is closed");
    }

    @Override
    public void On() {
        System.out.println("Samsung Freezer door is ON");
    }

    @Override
    public void Off() {
        System.out.println("Samsung Freezer door is OFF");
    }

}
