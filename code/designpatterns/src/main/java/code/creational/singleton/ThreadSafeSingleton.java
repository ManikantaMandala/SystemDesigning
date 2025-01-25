package code.creational.singleton;

public class ThreadSafeSingleton {

	public static volatile ThreadSafeSingleton instance;
	public String value;

	private ThreadSafeSingleton(String value) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.value = value;
	}

	public static ThreadSafeSingleton getInstance(String value) {
		if (instance != null) {
			return instance;
		}
		synchronized (ThreadSafeSingleton.class) {
			if (instance == null) {
				instance = new ThreadSafeSingleton(value);
			}
			return instance;
		}
	}

}
