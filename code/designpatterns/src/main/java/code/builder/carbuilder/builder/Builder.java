package code.builder.carbuilder.builder;

import code.builder.carbuilder.components.Engine;

public interface Builder {

	void reset();

	void setSeat(int seatNumber);

	void setEngine(Engine engine);

	void setTripComputer();

	void setGPSComputer();

}
