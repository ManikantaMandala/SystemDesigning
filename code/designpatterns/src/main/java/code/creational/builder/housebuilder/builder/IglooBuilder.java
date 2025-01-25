package code.creational.builder.housebuilder.builder;

import code.creational.builder.housebuilder.product.House;

public class IglooBuilder implements HomeBuilder {
	String windowType;
	String doorType;
	int numFloor;

	@Override
	public void setWindowType() {
		this.windowType = "Icy Ice";
	}

	@Override
	public void setDoorType() {
		this.doorType = "Icy door";
	}

	@Override
	public void setNumFloor() {
		this.numFloor = 1;
	}

	public House getProduct() {
		return new House(this.windowType, this.doorType, this.numFloor);
	}

}
