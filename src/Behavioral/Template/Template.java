package Behavioral.Template;

abstract public class Template {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
    }

    abstract void buildFoundation();
    abstract void buildPillars();
    abstract void buildWalls();

    public Template() {
        buildHouse();
    }
}
