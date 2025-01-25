package code.creational.singleton;

public class Main {

	public static void main(String[] args) {
		// Naive Singleton
		NaiveSingleton nSingleton1 = NaiveSingleton.getInstance("FOO");
		NaiveSingleton nSingleton2 = NaiveSingleton.getInstance("BAR");

		System.out.println(nSingleton1.value);
		System.out.println(nSingleton2.value);

		// Thread Safe Singleton

		Thread threadFoo = new Thread(new Runnable() {

			@Override
			public void run() {
				ThreadSafeSingleton tSafeSingleton = ThreadSafeSingleton.getInstance("FOO");
				System.out.println(tSafeSingleton.value);
			}

		});

		Thread threadBar = new Thread(new Runnable() {

			@Override
			public void run() {
				ThreadSafeSingleton tSafeSingleton = ThreadSafeSingleton.getInstance("BAR");
				System.out.println(tSafeSingleton.value);
			}

		});

		threadFoo.start();
		threadBar.start();
	}
}
