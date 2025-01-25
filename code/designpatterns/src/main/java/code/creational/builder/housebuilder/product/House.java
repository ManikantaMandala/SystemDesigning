package code.creational.builder.housebuilder.product;

public class House {
	String windowType;
	String doorType;
	int numFloor;

	public House(String windowType, String doorType, int numFloor) {
		this.windowType = windowType;
		this.doorType = doorType;
		this.numFloor = numFloor;
	}

	public String toString() {
		return "House[" + this.windowType
				+ "," + this.doorType + "," + this.numFloor + "]";
	}
}
