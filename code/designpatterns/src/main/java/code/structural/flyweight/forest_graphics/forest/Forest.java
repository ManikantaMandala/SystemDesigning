package code.structural.flyweight.forest_graphics.forest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import code.structural.flyweight.forest_graphics.trees.Tree;
import code.structural.flyweight.forest_graphics.trees.TreeType;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(
            int x,
            int y,
            String name,
            Color color,
            String otherTreeData) {
        TreeType tType = new TreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, tType);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
