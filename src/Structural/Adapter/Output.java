package Structural.Adapter;

public class Output {
    private static Converted converted;

    public static Converted getConverted() {
        return converted;
    }

    public static void setConverted(Converted converted) {
        Output.converted = converted;
    }

    public void converted() {
        converted.converted();
    }
}
