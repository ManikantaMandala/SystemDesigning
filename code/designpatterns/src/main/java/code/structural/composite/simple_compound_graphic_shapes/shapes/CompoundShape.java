package code.structural.composite.simple_compound_graphic_shapes.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CompoundShape extends BaseShape {
    protected List<Shape> children = new ArrayList<>();

    public CompoundShape(Shape... compounds) {
        super(0, 0, Color.BLACK);

        add(compounds);
    }

    public void add(Shape compound) {
        children.add(compound);
    }

    public void add(Shape[] compounds) {
        children.addAll(Arrays.asList(compounds));
    }

    public void remove(Shape compound) {
        children.remove(compound);
    }

    public void remove(Shape[] compounds) {
        children.removeAll(Arrays.asList(compounds));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public int getX() {
        if (children.size() == 0) {
            return 0;
        }
        int x = children.get(0).getX();

        for (Shape child : children) {
            x = Math.min(x, child.getX());
        }

        return x;
    }

    @Override
    public int getY() {
        if (children.size() == 0) {
            return 0;
        }
        int y = children.get(0).getY();

        for (Shape child : children) {
            y = Math.min(y, child.getY());
        }

        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();

        for (Shape child : children) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();

            maxWidth = Math.max(maxWidth, childWidth);
        }

        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();

        for (Shape child : children) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();

            maxHeight = Math.max(maxHeight, childHeight);
        }

        return maxHeight;
    }

    @Override
    public boolean isInsideBound(int x, int y) {
        for (Shape child : children) {
            if (child.isInsideBound(x, y)) {
                return true;
            }
        }
        return false;
    }

    public boolean selectChildAt(int x, int y) {
        for (Shape child : children) {
            if (child.isInsideBound(x, y)) {
                child.select();
                return true;
            }
        }
        return false;
    }

    @Override
    public void unselect() {
        super.unselect();

        for (Shape child : children) {
            child.unselect();
        }

    }

    @Override
    public void move(int x, int y) {
        for (Shape child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth(), getHeight());
            disableSelectionStyle(graphics);
        }

        for (Shape child : children) {
            child.paint(graphics);
        }
    }

}
