package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String, Icon> icons = new HashMap<>();
    public Icon getIcon(String type) {
        if (icons.containsKey(type)) {
            return icons.get(type); // gets file if it is in cache
        } else { // creates file if not in cache
            Icon icon;
            if (type.equals("file")) {
                icon = new FileIcon("document", "file.png");
            } else if (type.equals("folder")) {
                icon = new FolderIcon("green", "folder.png");
            } else {
                throw new IllegalArgumentException("Unknown icon type: " + type);
            }

            icons.put(type, icon);
            return icon;
        }
    }
}
