package code.abstract_factory.SmartHomeDeviceManagementSystem.products.television;

public class LGTelevision implements Television {

	@Override
	public void onTelevision() {
		System.out.println("LG Television is ON");
	}

	@Override
	public void offTelevision() {
		System.out.println("LG Television is OFF");
	}

}
