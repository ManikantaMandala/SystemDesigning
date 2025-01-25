package code.creational.prototype;

/**
 * Concrete Prototype of Shape
 */
public class Circle extends Shape {
	private int radius;
	private String color;
	public String name;

	public Circle() {
		this.name = this.toString();
	}

	public Circle(int radius, String color) {
		this.radius = radius;
		this.color = color;
		this.name = this.toString();
	}

	public Circle(Circle circle) {
		super(circle);

		this.radius = circle.radius;
		this.color = circle.color;
		this.name = this.toString() + "_clone";
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Circle) || !super.equals(object))
			return false;
		Circle shape2 = (Circle) object;
		return shape2.color == color && shape2.radius == radius;
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
