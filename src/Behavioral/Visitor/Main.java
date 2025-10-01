package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 4));
        shapes.add(new Triangle(3, 6));

        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("Total area: " + areaCalculator.getTotalArea());
    }
}
