package code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine;

public class XiaomiWashingMachine implements WashingMachine {

	@Override
	public void startingWashing() {
		System.out.println("Xiaomi washing machine is starting");
	}

	@Override
	public void openDoor() {
		System.out.println("Xiaomi washing machine door opened");
	}

	@Override
	public void closeDoor() {
		System.out.println("Xiaomi washing machine door closed");
	}

}
