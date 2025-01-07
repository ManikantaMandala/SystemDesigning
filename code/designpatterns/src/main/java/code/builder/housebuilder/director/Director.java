package code.builder.housebuilder.director;

import code.builder.housebuilder.builder.HomeBuilder;

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
