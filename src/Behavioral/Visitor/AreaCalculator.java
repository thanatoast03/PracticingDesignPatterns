package Behavioral.Visitor;

public class AreaCalculator implements ShapeVisitor {
    double totalArea = 0;

    @Override
    public void visit(Circle circle) {
        totalArea += Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visit(Rectangle rectangle) {
        totalArea += rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public void visit(Triangle triangle) {
        totalArea += triangle.getBase() * triangle.getHeight() / 2;
    }

    public double getTotalArea() {
        return totalArea;
    }
}
