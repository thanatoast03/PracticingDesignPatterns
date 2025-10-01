package Behavioral.Visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
