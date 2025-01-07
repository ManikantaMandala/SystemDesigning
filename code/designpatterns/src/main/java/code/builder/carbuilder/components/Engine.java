package code.builder.carbuilder.components;

public class Engine {
	int noOfPiston;

	public Engine() {
		this.noOfPiston = 4;
	}

	public Engine(int noOfPiston) {
		this.noOfPiston = noOfPiston;
	}

	@Override
	public String toString() {
		return "Engine[noOfPiston=" + noOfPiston + "]";
	}

	public int getNoOfPiston() {
		return noOfPiston;
	}

	public void setNoOfPiston(int noOfPiston) {
		this.noOfPiston = noOfPiston;
	}

}
