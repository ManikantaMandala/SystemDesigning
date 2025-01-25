package code.creational.prototype;

/**
 * Concrete Prototype of Shape Prototype
 */
public class Rectangle extends Shape {
	private int width;
	private int height;
	public String color;
	public String name;

	public Rectangle() {

	}

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof Rectangle) || !super.equals(object2))
			return false;
		Rectangle shape2 = (Rectangle) object2;
		return shape2.width == width && shape2.height == height;
	}

	public Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
		this.name = this.toString();
	}

	private Rectangle(Rectangle rectangle) {
		super(rectangle);

		this.width = rectangle.width;
		this.height = rectangle.height;
		this.color = rectangle.color;
		this.name = this.toString() + "_clone";
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
