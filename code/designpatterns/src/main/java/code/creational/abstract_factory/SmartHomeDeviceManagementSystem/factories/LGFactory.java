package code.creational.abstract_factory.SmartHomeDeviceManagementSystem.factories;

import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.Bulb;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.LGBulb;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.Freezer;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.LGFreezer;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.television.LGTelevision;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.television.Television;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.LGWashingMachine;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.WashingMachine;

public class LGFactory implements AbstractFactory {

	@Override
	public Bulb createBulb() {
		return new LGBulb();
	}

	@Override
	public Freezer createFreezer() {
		return new LGFreezer();
	}

	@Override
	public Television createTelevision() {
		return new LGTelevision();
	}

	@Override
	public WashingMachine createWashingMachine() {
		return new LGWashingMachine();
	}

}
