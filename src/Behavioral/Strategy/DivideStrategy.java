package Behavioral.Strategy;

public class DivideStrategy implements Strategy {
    @Override
    public int perform(int first, int second) {
        return first/second;
    }

    @Override
    public String getName() {
        return "Divide Strategy";
    }

    public DivideStrategy() {
        System.out.println(getName());
    }
}
