package Behavioral.Strategy;

public class AddStrategy implements Strategy {
    @Override
    public String getName() {
        return "Add Strategy";
    }

    @Override
    public int perform(int first, int second) {
        return first + second;
    }

    public AddStrategy() {
        System.out.println(getName());
    }
}
