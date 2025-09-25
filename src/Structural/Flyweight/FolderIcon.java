package Structural.Flyweight;

public class FolderIcon implements Icon {
    private String color;
    private String imageName;

    public FolderIcon(String color, String imageName) {
       this.color = color;
       this.imageName = imageName;
    }

    @Override
    public void draw(int x, int y){
        System.out.println("Printing " + color + " folder icon named " + imageName + " at " + x + ", " + y);
    }
}
