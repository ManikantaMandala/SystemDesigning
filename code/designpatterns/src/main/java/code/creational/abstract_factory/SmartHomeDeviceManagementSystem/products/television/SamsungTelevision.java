package code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.television;

public class SamsungTelevision implements Television {

	@Override
	public void onTelevision() {
		System.out.println("Samsung Television is ON");
	}

	@Override
	public void offTelevision() {
		System.out.println("Samsung Television is OFF");
	}

}
