package code.structural.composite.simple_compound_graphic_shapes;

import java.awt.Color;

import code.structural.composite.simple_compound_graphic_shapes.editor.ImageEditor;
import code.structural.composite.simple_compound_graphic_shapes.shapes.Circle;
import code.structural.composite.simple_compound_graphic_shapes.shapes.CompoundShape;
import code.structural.composite.simple_compound_graphic_shapes.shapes.Dot;
import code.structural.composite.simple_compound_graphic_shapes.shapes.Rectangle;

public class ClientDemosimpleCompoundGraphicShapes {

    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();

        imageEditor.loadShapes(
                new Circle(10, 10, 50, Color.RED),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(140, 140, Color.GREEN)),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.BLUE),
                        new Dot(240, 240, Color.MAGENTA),
                        new Dot(240, 360, Color.MAGENTA),
                        new Dot(360, 360, Color.MAGENTA),
                        new Dot(360, 240, Color.MAGENTA)));
    }
}
