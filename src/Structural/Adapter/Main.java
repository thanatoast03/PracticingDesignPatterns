package Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Adapter adapter = new Adapter(input);
        Output output = new Output();
        output.setConverted(adapter);
        output.converted();
    }
}
