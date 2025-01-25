package code.creational.builder.housebuilder.builder;

import code.creational.builder.housebuilder.product.House;

public class NormalBuilder implements HomeBuilder {
	String windowType;
	String doorType;
	int numFloor;

	@Override
	public void setWindowType() {
		this.windowType = "Glass";
	}

	@Override
	public void setDoorType() {
		this.doorType = "Wooden door";
	}

	@Override
	public void setNumFloor() {
		this.numFloor = 2;
	}

	public House getProduct() {
		return new House(
				this.windowType,
				this.doorType,
				this.numFloor);
	}

}
