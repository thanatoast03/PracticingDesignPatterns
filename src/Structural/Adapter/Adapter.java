package Structural.Adapter;

public class Adapter implements Converted {
    private static Input input;

    public Adapter(Input input) {
        this.input = input;
    }

    public void converted() {
        input.input();
        System.out.println("is now");
        System.out.println("Converted");
    }
}
