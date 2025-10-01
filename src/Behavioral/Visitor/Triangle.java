package Behavioral.Visitor;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
