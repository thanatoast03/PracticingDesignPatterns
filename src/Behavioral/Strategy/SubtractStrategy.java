package Behavioral.Strategy;

public class SubtractStrategy implements Strategy {
    @Override
    public int perform(int first, int second) {
        return first - second;
    }

    @Override
    public String getName() {
        return "Subtract Strategy";
    }

    public SubtractStrategy() {
        System.out.println(getName());
    }
}
