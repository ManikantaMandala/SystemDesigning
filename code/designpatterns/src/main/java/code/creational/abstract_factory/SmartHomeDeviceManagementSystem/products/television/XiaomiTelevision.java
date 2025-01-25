package code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.television;

public class XiaomiTelevision implements Television {

	@Override
	public void onTelevision() {
		System.out.println("Xiaomi Television is ON");
	}

	@Override
	public void offTelevision() {
		System.out.println("Xiaomi Television is OFF");
	}

}
