package code.creational.builder.housebuilder.director;

import code.creational.builder.housebuilder.builder.HomeBuilder;

public class Director {

	HomeBuilder builder;

	public Director() {
	};

	public Director(HomeBuilder builder) {
		this.builder = builder;
	}

	public void setBuilder(HomeBuilder builder) {
		this.builder = builder;
	}

	public void makeHouse() {
		builder.setWindowType();
		builder.setDoorType();
		builder.setNumFloor();
	}
}
