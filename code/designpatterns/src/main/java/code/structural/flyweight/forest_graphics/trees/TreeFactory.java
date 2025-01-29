package code.structural.flyweight.forest_graphics.trees;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(
            String name,
            Color color,
            String otherTreeData) {

        TreeType treeType = treeTypes.get(name);
        if (treeType == null) {
            treeType = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, treeType);
        }
        return treeType;
    }
}
