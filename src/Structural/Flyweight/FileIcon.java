package Structural.Flyweight;

public class FileIcon implements Icon {
    private String type; // ex. document, image
    private String fileName;

    public FileIcon(String type, String fileName) {
        this.type = type;
        this.fileName = fileName;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Printing " + type + " icon named " + fileName + " at " + x + ", " + y);
    }
}
