package code.creational.builder.carbuilder.components.computer.product;

public class GPSComputer implements Computer {

	@Override
	public String doStuff() {
		int[] coordinates = getGPS();
		return "GPSComputer[you are at " + coordinates[0] + " longitude and " + coordinates[1] + " latitude]";
	}

	public int[] getGPS() {
		return new int[] { -1, -1 };
	}

	public String toString() {
		return doStuff();
	}

}
