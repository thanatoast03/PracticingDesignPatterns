package Behavioral.Strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int performStrategy(int num1, int num2) {
        return strategy.perform(num1, num2);
    }
}
