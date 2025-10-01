package Behavioral.Strategy;

public class MultiplyStrategy implements Strategy {
    @Override
    public int perform(int first, int second) {
        return first * second;
    }

    @Override
    public String getName() {
        return "Multiply Strategy";
    }

    public MultiplyStrategy() {
        System.out.println(getName());
    }
}
