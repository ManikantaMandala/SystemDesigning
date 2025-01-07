package code.abstract_factory.SmartHomeDeviceManagementSystem.factories;

import code.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.Bulb;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.SamsungBulb;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.Freezer;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.SamsungFreezer;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.television.SamsungTelevision;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.television.Television;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.SamsungWashingMachine;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.WashingMachine;

public class SamsungFactory implements AbstractFactory {

	@Override
	public Bulb createBulb() {
		return new SamsungBulb();
	}

	@Override
	public Freezer createFreezer() {
		return new SamsungFreezer();
	}

	@Override
	public Television createTelevision() {
		return new SamsungTelevision();
	}

	@Override
	public WashingMachine createWashingMachine() {
		return new SamsungWashingMachine();
	}

}
