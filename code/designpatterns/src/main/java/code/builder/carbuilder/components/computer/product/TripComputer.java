package code.builder.carbuilder.components.computer.product;

public class TripComputer implements Computer {

	@Override
	public String doStuff() {
		return "TripComputer[you travelled " + getTripDistanceInKM() + " kilo-meters in this trip]";
	}

	public int getTripDistanceInKM() {
		return 100;
	}

	public String toString() {
		return doStuff();
	}

}
