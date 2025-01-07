package code.builder.carbuilder.director;

import code.builder.carbuilder.builder.Builder;
import code.builder.carbuilder.components.Engine;

public class CarDirector {

	public CarDirector() {
	}

	public void makeSUV(Builder builder) {
		builder.setSeat(4);
		builder.setEngine(new Engine());
		builder.setGPSComputer();
		builder.setTripComputer();
	}

	public void makeSportsCar(Builder builder) {
		builder.setSeat(1);
		builder.setEngine(new Engine(6));
		builder.setTripComputer();
	}
}
