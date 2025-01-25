package code.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeRegistryClient {

	public static List<Shape> shapes = new ArrayList<>();
	public static List<Shape> clonedShapes = new ArrayList<>();

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(4);
		circle.setColor("yellow");
		shapes.add(circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(4);
		rectangle.setHeight(8);
		rectangle.setColor("red");
		shapes.add(rectangle);
	}

	public static void compareRegistry() {
		for (Shape shape : shapes) {
			clonedShapes.add(shape.clone());
		}

		int len = shapes.size();
		for (int i = 0; i < len; i++) {
			if (shapes.get(i) != clonedShapes.get(i)) {
				if (shapes.get(i).equals(clonedShapes.get(i))) {
					System.out.println(i + "yay!");
				} else {
					System.out.println(i + "boo!");
				}
			} else {
				System.out.println(i + "boo!");
			}
		}
	}

}
