package code.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine;

public class SamsungWashingMachine implements WashingMachine {

	@Override
	public void startingWashing() {
		System.out.println("Samsung washing machine is starting");
	}

	@Override
	public void openDoor() {
		System.out.println("Samsung washing machine door opened");
	}

	@Override
	public void closeDoor() {
		System.out.println("Samsung washing machine door closed");
	}

}
