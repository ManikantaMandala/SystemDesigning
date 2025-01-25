package code.creational.prototype;

/**
 * Prototype
 */
public abstract class Shape {
	public int x;
	private int y;
	public String color = "red";

	public Shape() {
	}

	public Shape(Shape shape) {
		this.x = shape.x;
		this.y = shape.y;
		this.color = shape.color;
	}

	public abstract Shape clone();

	public boolean equals(Object object) {
		if (!(object instanceof Shape))
			return false;
		Shape shape2 = (Shape) object;
		return shape2.x == x && shape2.y == y && shape2.color == color;
	}
}
