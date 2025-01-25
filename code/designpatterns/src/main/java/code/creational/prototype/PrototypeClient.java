package code.creational.prototype;

public class PrototypeClient {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(4, 4, "yellow");

		// clone object of rectangle
		Shape clonedRectangle = rectangle.clone();

		System.out.println(rectangle);
		System.out.println(clonedRectangle);
	}
}
