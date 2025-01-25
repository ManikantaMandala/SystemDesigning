package code.creational.abstract_factory.SmartHomeDeviceManagementSystem;

import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.factories.AbstractFactory;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.Bulb;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.Freezer;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.television.Television;
import code.creational.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.WashingMachine;

public class Home {
	AbstractFactory factory;

	Bulb bulb;
	Freezer freezer;
	Television television;
	WashingMachine wMachine;

	public Home(AbstractFactory factory) {
		this.factory = factory;

		setBulb();
		setFreezer();
		setTelevision();
		setWashingMachine();
	}

	public void setBulb() {
		this.bulb = orderBulb();
	}

	public Bulb orderBulb() {
		return this.factory.createBulb();
	}

	public void setFreezer() {
		this.freezer = orderFreezer();
	}

	public Freezer orderFreezer() {
		return this.factory.createFreezer();
	}

	public void setTelevision() {
		this.television = orderTelevision();
	}

	public Television orderTelevision() {
		return this.factory.createTelevision();
	}

	public void setWashingMachine() {
		this.wMachine = orderWashingMachine();
	}

	public WashingMachine orderWashingMachine() {
		return this.factory.createWashingMachine();
	}
}
