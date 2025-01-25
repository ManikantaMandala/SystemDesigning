package code.structural.bridge.shape_color;

import code.structural.bridge.shape_color.Color.Blue;
import code.structural.bridge.shape_color.Color.Red;
import code.structural.bridge.shape_color.Shape.Cuboid;
import code.structural.bridge.shape_color.Shape.Shape;
import code.structural.bridge.shape_color.Shape.Sphere;

public class Main {

	public static void main(String[] args) {
		Shape redCuboid = new Cuboid(new Red());
		Shape blueCuboid = new Cuboid(new Blue());
		Shape blueSphere = new Sphere(new Blue());
		Shape redSphere = new Sphere(new Red());

		redCuboid.printShapeType();
		blueCuboid.printShapeType();
		blueSphere.printShapeType();
		redSphere.printShapeType();

	}
}
