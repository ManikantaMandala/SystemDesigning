package code.abstract_factory.SmartHomeDeviceManagementSystem.factories;

import code.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.Bulb;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.XiaomiBulb;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.Freezer;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.XiaomiFreezer;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.television.Television;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.television.XiaomiTelevision;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.WashingMachine;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.XiaomiWashingMachine;

public class XiaomiFactory implements AbstractFactory {

	@Override
	public Bulb createBulb() {
		return new XiaomiBulb();
	}

	@Override
	public Freezer createFreezer() {
		return new XiaomiFreezer();
	}

	@Override
	public Television createTelevision() {
		return new XiaomiTelevision();
	}

	@Override
	public WashingMachine createWashingMachine() {
		return new XiaomiWashingMachine();
	}

}
