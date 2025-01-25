package code.structural.composite.simple_compound_graphic_shapes.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class BaseShape implements Shape {
	public int x;
	public int y;
	public Color color;
	private boolean selected = false;

	public BaseShape(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public boolean isInsideBound(int x, int y) {
		return x > getX() && x < (getX() + getWidth()) &&
				y > getY() && y < (getY() + getHeight());
	}

	@Override
	public boolean isSelected() {
		return selected;
	}

	// Think about this
	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public void select() {
		selected = true;
	}

	@Override
	public void unselect() {
		selected = false;
	}

	protected void enableSelectionStyle(Graphics graphics) {
		graphics.setColor(color.brighter());

		// what it does?
		Graphics2D g2 = (Graphics2D) graphics;
		float[] dash1 = { 2.0f };

		// Example of CAP styles
		g2.setStroke(new BasicStroke(
				1.0f,
				BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_MITER,
				1.0f,
				dash1,
				2.0f));
	}

	protected void disableSelectionStyle(Graphics graphics) {
		graphics.setColor(color.brighter());

		// What it does?
		Graphics2D g2 = (Graphics2D) graphics;
		g2.setStroke(new BasicStroke());
	}

	@Override
	public void paint(Graphics graphics) {
		if (isSelected()) {
			enableSelectionStyle(graphics);
		} else {
			disableSelectionStyle(graphics);
		}

	}

}
