package code.creational.singleton;

public class NaiveSingleton {
	private static NaiveSingleton instance;
	public String value;
	
	private NaiveSingleton(String value){
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.value = value;
	}

	public static NaiveSingleton getInstance(String value){
		if (instance == null) {
			instance = new NaiveSingleton(value);
		}
		return instance;
	}

}
