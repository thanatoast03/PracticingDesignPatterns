package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        // 10 * 3 - 4
        Context context = new Context();
        context.setStrategy(new MultiplyStrategy());
        int firstOp = context.performStrategy(10, 3);

        context.setStrategy(new SubtractStrategy());
        System.out.println(context.performStrategy(firstOp, 4));
    }
}
