package code.structural.bridge.shape_color.Shape;

import code.structural.bridge.shape_color.Color.Color;

public class Sphere implements Shape {
    Color color;

    public Sphere(Color color) {
        this.color = color;
    }

    @Override
    public void printShapeType() {
        System.out.println("the shape is cuboid with " + this.color.getColor() + "color");
    }
}
