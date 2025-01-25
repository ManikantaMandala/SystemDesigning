package code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine;

public class LGWashingMachine implements WashingMachine {

	@Override
	public void startingWashing() {
		System.out.println("LG washing machine is starting");
	}

	@Override
	public void openDoor() {
		System.out.println("LG washing machine door opened");
	}

	@Override
	public void closeDoor() {
		System.out.println("LG washing machine door closed");
	}

}
