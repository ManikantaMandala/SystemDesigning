package code.structural.composite.simple_compound_graphic_shapes.shapes;

import java.awt.Graphics;

public interface Shape {

	int getX();

	int getY();

	int getWidth();

	int getHeight();

	void move(int x, int y);

	boolean isInsideBound(int x, int y);

	void select();

	void unselect();

	boolean isSelected();

	void paint(Graphics graphics);
}
