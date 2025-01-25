package code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer;

public class XiaomiFreezer implements Freezer {

	@Override
	public void openDoor() {
		System.out.println("Xiaomi Freezer door is opened");
	}

	@Override
	public void closeDoor() {
		System.out.println("Xiaomi Freezer door is closed");
	}

	@Override
	public void On() {
		System.out.println("Xiaomi Freezer door is ON");
	}

	@Override
	public void Off() {
		System.out.println("Xiaomi Freezer door is OFF");
	}

}
